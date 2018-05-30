package com.korolija.dao;

import com.korolija.model.Employee;

public interface EmployeeDAO {
	
	public abstract Employee getEmployeeNameAndSalaryById(int employeeId);


}
