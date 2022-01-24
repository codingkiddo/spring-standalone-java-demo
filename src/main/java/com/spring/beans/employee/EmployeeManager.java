package com.spring.beans.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

	@Autowired
	private DataSource dataSource;

	public void getAllEmployee() throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			String sql = "SELECT emp_no first_name, last_name FROM Employees where emp_no=499999";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs.getInt("emp_no"));
	            System.out.print(", First: " + rs.getString("first_name"));
	            System.out.println(", Last: " + rs.getString("last_name"));
	         }
		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}