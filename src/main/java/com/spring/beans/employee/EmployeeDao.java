package com.spring.beans.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void getAllEmployee(long emp_no) {
		String sql = "SELECT emp_no, first_name, last_name FROM employees where emp_no=?";
		final Object[] params = new Object[] { emp_no };
		jdbcTemplate.query(sql, params, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException { 
				// Retrieve by column name
	            System.out.print("ID: " + rs.getInt("emp_no"));
	            System.out.print(", First: " + rs.getString("first_name"));
	            System.out.println(", Last: " + rs.getString("last_name"));
			}
		});
	}
}
