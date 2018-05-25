package com.korolija.service.impl;

import java.util.List;

import com.korolija.dao.EmployeeDAO;

import com.korolija.model.Employee;
import com.korolija.service.EmployeeService;

public class EmployeeServiceImplementation implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	
	
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void addEmployee(Employee employee) {
        employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
        employeeDAO.deleteEmployeeById(employeeId);
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
        employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
	}

	@Override
	public List<Employee> getAllEmployeesInfo() {
		
		return employeeDAO.getAllEmployeesDetails();
	}

}
