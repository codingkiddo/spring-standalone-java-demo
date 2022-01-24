package com.spring.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.beans.employee.EmployeeDao;
import com.spring.beans.employee.EmployeeManager;

@Configuration
@PropertySource("classpath:database.properties")
public class JavaConfig {

	@Autowired
    private Environment env;
	
	@Bean
	public EmployeeManager getEmployeeManager() {
		return new EmployeeManager();
	}
	
	@Bean
	public EmployeeDao getEmployeeDao() {
		return new EmployeeDao();
	}
	
	@Bean
	public DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("MYSQL_DB_DRIVER_CLASS"));
		ds.setUrl(env.getProperty("MYSQL_DB_URL"));
		ds.setUsername(env.getProperty("MYSQL_DB_USERNAME"));
		ds.setPassword(env.getProperty("MYSQL_DB_PASSWORD"));
		ds.setInitialSize(10); // The initial number of connections that
        // are created when the pool is started.
		ds.setMaxTotal(20); // The maximum number of active connections
        // that can be allocated from this pool
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}