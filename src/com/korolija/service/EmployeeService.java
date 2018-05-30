package com.korolija.service;

import com.korolija.model.Employee;

public interface EmployeeService {

	public abstract Employee fetchEmployeeNameAndSalaryById(int employeeId);
}
