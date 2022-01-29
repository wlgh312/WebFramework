package edu.kim.webfinal.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.kim.webfinal.Inform;
import edu.kim.webfinal.db.InfMapper;

@Component
public class InfDB {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource datasource){
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	public void create(Inform inf) {
		String sql = "INSERT INTO stdinfo(id, name, attendance, assignment, project, midTest, finalTest, grade) values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, inf.getId(), inf.getName(), inf.getAttendance(), inf.getAssignment(), inf.getProject(), inf.getMidTest(), inf.getFinalTest(), inf.getGrade());
	}
	public List<Inform> select(){
		String sql="select * from stdinfo";
		List<Inform> std = jdbcTemplate.query(sql, new InfMapper());
		System.out.println("select 값 : "+std);
		return std;
	}
	public void caution(Inform inf){
		String sql = "UPDATE stdinfo SET resScore=attendance*0.1+assignment*0.2+project*0.2+midTest*0.2+finalTest*0.3;";
		jdbcTemplate.update(sql);
	}
	public Inform select(int seq) {
		String sql = "select * from stdinfo where seq=?";
		Inform std = jdbcTemplate.queryForObject(sql, new Object[] {seq}, new InfMapper());
		return std;
	}
	public List<Integer> preGrade() {
		String sql = "SELECT scoRank FROM (SELECT seq, NTILE(8) OVER(ORDER BY resScore DESC) AS scoRank FROM stdinfo) ex1 ORDER BY seq";
		List<Integer> n = jdbcTemplate.queryForList(sql, Integer.class);
		return n;
	}
	public void update(Inform inf) {
		String sql = "update stdinfo set id=?, name=?, attendance=?, assignment=?, project=?, midTest=?, finalTest=?, grade=? where seq=?;";
		jdbcTemplate.update(sql, inf.getId(), inf.getName(), inf.getAttendance(), inf.getAssignment(), inf.getProject(), inf.getMidTest(), inf.getFinalTest(),inf.getGrade(), inf.getSeq());
	}
	public void midpicUpdate(String s, int seq) {
		String sql = "update stdinfo set midPic=? where seq=?";
		jdbcTemplate.update(sql, s, seq);
	}
	public void finpicUpdate(String s, int seq) {
		String sql = "update stdinfo set finalPic=? where seq=?";
		jdbcTemplate.update(sql, s, seq);
	}
	public String midPrint(int seq) {
		String sql = "select midPic from stdinfo where seq=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{seq}, String.class); 
	}
	public String finPrint(int seq) {
		String sql = "select finalPic from stdinfo where seq=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{seq}, String.class); 
	}
	public int delete(int seq) {
		String sql = "delete from stdinfo where seq=?";
		return jdbcTemplate.update(sql, seq);
	}
}
