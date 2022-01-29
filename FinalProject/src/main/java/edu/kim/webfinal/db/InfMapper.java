package edu.kim.webfinal.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.kim.webfinal.Inform;

public class InfMapper implements RowMapper<Inform>{
	@Override
	public Inform mapRow(ResultSet rs, int rowNum) throws SQLException{
		Inform inf = new Inform();
		inf.setSeq(rs.getInt("seq"));
		inf.setId(rs.getString("id"));
		inf.setName(rs.getString("name"));
		inf.setAttendance(rs.getFloat("attendance"));
		inf.setAssignment(rs.getFloat("assignment"));
		inf.setProject(rs.getFloat("project"));
		inf.setMidTest(rs.getFloat("midTest"));
		inf.setFinalTest(rs.getFloat("finalTest"));
		inf.setResSocre(rs.getFloat("resScore"));
		inf.setGrade(rs.getString("grade"));
		inf.setMidPic(rs.getString("midPic"));
		inf.setFinalPic(rs.getString("finalPic"));
		return inf;
	}
}
