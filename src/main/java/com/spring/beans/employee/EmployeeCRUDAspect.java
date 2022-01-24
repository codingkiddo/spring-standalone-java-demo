package com.spring.beans.employee;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCRUDAspect {

	@Before("execution(* EmployeeManager.getEmployeeById(..))")
	public void logBeforeV1(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* EmployeeManager.*(..))")
	public void logBeforeV2(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* EmployeeManager.getEmployeeById(..))")
	public void logAfterV1(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* EmployeeManager.*(..))")
	public void logAfterV2(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDAspect.logAfterV2() : " + joinPoint.getSignature().getName());
	}
	
	@Around("execution(* EmployeeManager.update*(..))")
	public void logAroundV2(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDAspect.logAroundV2() : " + joinPoint.getSignature().getName());
	}
}