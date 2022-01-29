package edu.kim.webfinal.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.kim.webfinal.profInform;

public class profInfMapper implements RowMapper<profInform>{
	@Override
	public profInform mapRow(ResultSet rs, int rowNum) throws SQLException{
		profInform pinf = new profInform();
		
		pinf.setName(rs.getString("name"));
		pinf.setPic(rs.getString("pic"));
		return pinf;
	}
}
