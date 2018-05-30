package com.korolija.service.impl;

import com.korolija.dao.EmployeeDAO;
import com.korolija.model.Employee;
import com.korolija.service.EmployeeService;

public class EmployeeServiceImplementation implements EmployeeService {

	
	private EmployeeDAO employeeDAO;
	
	
	
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}




	@Override
	public Employee fetchEmployeeNameAndSalaryById(int employeeId) {
		return employeeDAO.getEmployeeNameAndSalaryById(employeeId);
	}

}
