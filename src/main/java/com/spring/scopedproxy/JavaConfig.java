package com.spring.scopedproxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

//https://www.javacodegeeks.com/2012/08/spring-scoped-proxy.html

@Configuration
//@ComponentScan("com.spring.scopedproxy")
public class JavaConfig {

	
	@Bean
//	@Scope("prototype")
	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public PrototypeScopedBean getPrototypeScopedBean() {	
		return new PrototypeScopedBean();
	}
	
	@Bean
	public SingletonScopedBean getSingletonScopedBean() {
		return new SingletonScopedBean();
	}
}
