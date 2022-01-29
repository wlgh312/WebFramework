package edu.kim.webfinal.db;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.kim.webfinal.profInform;

@Component
public class profInfDB {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource datasource){
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	public void profupdate(String name, String pic) {
		String sql = "update profinfo set name=?, pic=? where position='prof'";
		jdbcTemplate.update(sql, name, pic);
	}
	public void asstupdate(String name, String pic) {
		String sql = "update profinfo set name=?, pic=? where position='asst'";
		jdbcTemplate.update(sql, name, pic);
	}
	public String profPrint(String pos) {
		String sql = "select pic from profinfo where position=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{pos}, String.class);
	}
	public String nameP(String pos){
		String sql = "select name from profinfo where position=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {pos}, String.class);
	}
}
