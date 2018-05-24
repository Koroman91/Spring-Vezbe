package com.korolija.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Employee;
import com.korolija.service.EmployeeService;
import com.korolija.service.impl.EmployeeServiceImplementation;

public class ClientTest {

	public static void main(String [] args) {
		
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImplementation.class);
		
		//createEmployee(employeeService);
		
		//getEmployeeById(employeeService);
		
		//fetchAllEmployeesInfo(employeeService);
		
		//employeeService.updateEmployeeEmailById("stefankorolija1991@gmail.com", 2);
		
		employeeService.deleteEmployeeById(3);
		ctx.close();


	}

	private static void fetchAllEmployeesInfo(EmployeeService employeeService) {
		List<Employee> empList = employeeService.getAllEmployeesInfo();
		for(Employee employee :empList) {
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getGender()+"\t"+employee.getSalary());
		}
	}

	private static void getEmployeeById(EmployeeService employeeService) {
		Employee employee = employeeService.fetchEmployeeById(2);	
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
	}

	private static void createEmployee(EmployeeService employeeService) {
		Employee employee = new Employee();
		employee.setEmail("nikola@gmail.com");
		employee.setEmployeeName("Nikola");
		employee.setGender("Male");
		employee.setSalary(90000.00);
		
		employeeService.addEmployee(employee);
	}
}
