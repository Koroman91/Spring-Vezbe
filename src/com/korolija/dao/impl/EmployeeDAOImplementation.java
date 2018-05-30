package com.korolija.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.korolija.dao.EmployeeDAO;
import com.korolija.model.Employee;

@Repository
public class EmployeeDAOImplementation extends NamedParameterJdbcDaoSupport implements EmployeeDAO {

	@Autowired
	private DataSource dataSource;
    

	








	@Override
	public Employee getEmployeeById(int employeeId) {
		
		String SQL="SELECT * FROM employee_table WHERE employee_id=:empId";

       /* Map<String, Object> inputMap = new HashMap<>();
        inputMap.put("empId", employeeId);*/
		
		
		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("empId", employeeId);
		
		Employee employee = getNamedParameterJdbcTemplate().queryForObject(SQL, inputMap, new EmployeeRowMapper());
		return employee;
	}



	@Override
	public void deleteEmployeeById(int employeeId) {
	String SQL="DELETE FROM employee_table WHERE employee_Id=:empId";
	
	MapSqlParameterSource inputMap = new MapSqlParameterSource();
	inputMap.addValue("empId", employeeId);	
		
		
		int update = getNamedParameterJdbcTemplate().update(SQL, inputMap);
		if (update>0) {
			System.out.print("Email is deleted!");
		}
	
		}
	



	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		String SQL="UPDATE employee_table SET email=:newEmail WHERE employee_Id=:empId";
		
		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("empId", employeeId);
		inputMap.addValue("newEmail", newEmail);
		
		int update = getNamedParameterJdbcTemplate().update(SQL, inputMap);
		if (update>0) {
			System.out.print("Email is updated!");
		}
	}



	@Override
	public List<Employee> getAllEmployeesDetails() {
		
	String SQL="SELECT * FROM employee_table";
	List<Employee> empList = getNamedParameterJdbcTemplate().query(SQL, new EmployeeRowMapper());
		//List<Employee> query = jdbcTemplate.query(SQL, new EmployeeRowMapper());
		//return jdbcTemplate.query(SQL, new EmployeeRowMapper());
		return empList;
	}

	@Override
	public void createEmployee(Employee employee) {
   	String SQL ="INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(:empName,:email,:gender,:sal)";
       
   	MapSqlParameterSource inputMap = new MapSqlParameterSource();
	inputMap.addValue("empName", employee.getEmployeeName());
	inputMap.addValue("email", employee.getEmail());
	inputMap.addValue("gender", employee.getGender());
	inputMap.addValue("sal", employee.getSalary());
   	
    int update = getNamedParameterJdbcTemplate().update(SQL, inputMap);
		if (update>0)
        	
    		System.out.println("Employee is created!");
		
		
	}
	
	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}

}
