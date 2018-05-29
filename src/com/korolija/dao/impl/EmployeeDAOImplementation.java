package com.korolija.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.korolija.dao.EmployeeDAO;
import com.korolija.model.Employee;


public class EmployeeDAOImplementation extends JdbcDaoSupport implements EmployeeDAO {


	

	@Override
	public void createEmployee(Employee employee) {
  /*  	String SQL ="INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(?,?,?,?)";
        int update = jdbcTemplate.update(SQL, new Object[] {employee.getEmployeeName(),employee.getEmail(), employee.getGender(), employee.getSalary()});*/
    	int update=getJdbcTemplate().update("INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(?,?,?,?)", employee.getEmployeeName(),employee.getEmail(), employee.getGender(), employee.getSalary());
		
		if (update>0)
        	
    		System.out.println("Employee is created!");
	}






	@Override
	public Employee getEmployeeById(int employeeId) {
		String SQL="SELECT * FROM employee_table WHERE employee_id=?";
		Employee employee = getJdbcTemplate().queryForObject(SQL, new EmployeeRowMapper(), employeeId);
		return employee;
	}



	@Override
	public void deleteEmployeeById(int employeeId) {
		String SQL="DELETE FROM employee_table WHERE employee_Id=?";
		int update = getJdbcTemplate().update(SQL, employeeId);
		if (update>0) {
			System.out.print("Email is deleted!");
		}
	}



	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		String SQL="UPDATE employee_table SET email=? WHERE employee_Id=?";
		int update = getJdbcTemplate().update(SQL, newEmail, employeeId);
		if (update>0) {
			System.out.print("Email is updated!");
		}
	}



	@Override
	public List<Employee> getAllEmployeesDetails() {
		String SQL="SELECT * FROM employee_table";
		//List<Employee> query = jdbcTemplate.query(SQL, new EmployeeRowMapper());
		return getJdbcTemplate().query(SQL, new EmployeeRowMapper());
	}



}
