package com.korolija.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // Employee employee = new Employee();
public class Employee {
	
	@Value("30091991")
	private int employeeId;
	
	@Value("Stefan Korolija")
	private String employeeName;
	
	@Autowired
	private Pancard pancard;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Pancard getPancard() {
		return pancard;
	}

	
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
	

}
