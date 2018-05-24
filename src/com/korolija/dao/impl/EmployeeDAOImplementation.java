package com.korolija.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.korolija.dao.EmployeeDAO;
import com.korolija.model.Employee;


public class EmployeeDAOImplementation implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
		
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void createEmployee(Employee employee) {
  /*  	String SQL ="INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(?,?,?,?)";
        int update = jdbcTemplate.update(SQL, new Object[] {employee.getEmployeeName(),employee.getEmail(), employee.getGender(), employee.getSalary()});*/
    	int update=jdbcTemplate.update("INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(?,?,?,?)", employee.getEmployeeName(),employee.getEmail(), employee.getGender(), employee.getSalary());
		
		if (update>0)
        	
    		System.out.println("Employee is created!");
	}



	@Override
	public Employee getEmployeeById(int employeeId) {
		String SQL="SELECT * FROM employee_table WHERE employee_id=?";
		Employee employee = jdbcTemplate.queryForObject(SQL, new EmployeeRowMapper(), employeeId);
		return employee;
	}



	@Override
	public void deleteEmployeeById(int employeeId) {
		
	}



	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		
	}



	@Override
	public List<Employee> getAllEmployeesDetails() {
		return null;
	}



}
