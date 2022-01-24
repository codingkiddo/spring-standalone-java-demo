package com.spring.beans.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages= {"com.spring.beans.employee"})
public class JavaConfigAop {

	@Bean
	public EmployeeManager getEmployeeManager() {
		return new EmployeeManager();
	}
	
	@Bean
	public EmployeeCRUDAspect getEmployeeCRUDAspect() {
		return new EmployeeCRUDAspect();
	}
}
