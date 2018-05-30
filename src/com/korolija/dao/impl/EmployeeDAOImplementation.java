package com.korolija.dao.impl;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.korolija.dao.EmployeeDAO;
import com.korolija.model.Employee;

public class EmployeeDAOImplementation implements EmployeeDAO {
	
	private SimpleJdbcCall simpleJdbcCall;
	
	
	

	public void setSimpleJdbcCall(SimpleJdbcCall simpleJdbcCall) {
		this.simpleJdbcCall = simpleJdbcCall;
	}




	@Override
	public Employee getEmployeeNameAndSalaryById(int employeeId) {
		simpleJdbcCall.withProcedureName("getEmployeeNameAndSalaryById");
		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		inputMap.addValue("emp_id", employeeId);
		
		Map<String, Object> outMap = simpleJdbcCall.execute(inputMap);
		
		Employee employee = new Employee();
		employee.setEmployeeName(((String)outMap.get("map_name")));
		employee.setSalary((Double)outMap.get("emp_sal"));
		
		return employee;
	}

}
