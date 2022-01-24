package com.spring.beans.employee;

import java.util.Date;

public class Employee {

	private long emp_id;
	private String first_name;
	private Date birth_date;
	private char gender;
	private Date hire_date;
	
	public Employee(long emp_id, String first_name, Date birth_date, char gender, Date hire_date) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.birth_date = birth_date;
		this.gender = gender;
		this.hire_date = hire_date;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	
}
