package com.korolija.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.korolija.dao.EmployeeDAO;
import com.korolija.model.Employee;


public class EmployeeDAOImplementation implements EmployeeDAO {

	//private DataSource dataSource;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	
		
/*	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}*/
	
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	








	@Override
	public Employee getEmployeeById(int employeeId) {
		
		String SQL="SELECT * FROM employee_table WHERE employee_id=:empId";

        Map<String, Object> inputMap = new HashMap<>();
        inputMap.put("empId", employeeId);
		Employee employee = namedParameterJdbcTemplate.queryForObject(SQL, inputMap, new EmployeeRowMapper());
		return employee;
	}



	@Override
	public void deleteEmployeeById(int employeeId) {
/*		String SQL="DELETE FROM employee_table WHERE employee_Id=?";
		int update = jdbcTemplate.update(SQL, employeeId);
		if (update>0) {
			System.out.print("Email is deleted!");*/
		}
	



	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
/*		String SQL="UPDATE employee_table SET email=? WHERE employee_Id=?";
		int update = jdbcTemplate.update(SQL, newEmail, employeeId);
		if (update>0) {
			System.out.print("Email is updated!");*/
		
	}



	@Override
	public List<Employee> getAllEmployeesDetails() {
		return null;
/*		String SQL="SELECT * FROM employee_table";
		//List<Employee> query = jdbcTemplate.query(SQL, new EmployeeRowMapper());
		return jdbcTemplate.query(SQL, new EmployeeRowMapper());*/
	}

	@Override
	public void createEmployee(Employee employee) {
/*    	String SQL ="INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(?,?,?,?)";
        int update = jdbcTemplate.update(SQL, new Object[] {employee.getEmployeeName(),employee.getEmail(), employee.getGender(), employee.getSalary()});
    	int update=jdbcTemplate.update("INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(?,?,?,?)", employee.getEmployeeName(),employee.getEmail(), employee.getGender(), employee.getSalary());
		
		if (update>0)
        	
    		System.out.println("Employee is created!");*/
		
		
	}

}
