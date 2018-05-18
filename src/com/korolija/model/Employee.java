package com.korolija.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	
	
	private Pancard pancard;

    @Autowired
	public Employee(int employeeId, String employeeName, Pancard pancard) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.pancard = pancard;
	}


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
