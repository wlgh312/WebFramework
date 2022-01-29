package edu.hallym.DBtest.db;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.hallym.DBtest.Student;
@Component
public class StdDB {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource datasource){
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	public void create(Student std) {
		String sql = "INSERT INTO student(id, name, age) values(?,?,?)";
		jdbcTemplate.update(sql, std.getId(), std.getName(), std.getAge());
	}

}
