package com.spring.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.employee.EmployeeDao;
import com.spring.beans.employee.EmployeeManager;
import com.spring.config.JavaConfig;

public class MainJavaConfig {

	public static void main(String[] args) throws SQLException {
		ApplicationContext javaCtx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		EmployeeManager employeeManager = javaCtx.getBean(EmployeeManager.class);
//		employeeManager.getAllEmployee();
		
		EmployeeDao dao = javaCtx.getBean(EmployeeDao.class);
		dao.getAllEmployee(499999);
		((AnnotationConfigApplicationContext)javaCtx).close();
	}
}
