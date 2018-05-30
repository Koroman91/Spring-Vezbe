package com.korolija.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korolija.dao.EmployeeDAO;
import com.korolija.model.Employee;
import com.korolija.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImplementation implements EmployeeService {

	
	private EmployeeDAO employeeDAO;
	
	
	
	@Autowired
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}




	@Override
	public Employee fetchEmployeeNameAndSalaryById(int employeeId) {
		return employeeDAO.getEmployeeNameAndSalaryById(employeeId);
	}

}
