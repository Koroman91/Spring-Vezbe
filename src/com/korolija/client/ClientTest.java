package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Employee;
import com.korolija.service.EmployeeService;
import com.korolija.service.impl.EmployeeServiceImplementation;

public class ClientTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImplementation.class);

		Employee employee = employeeService.fetchEmployeeNameAndSalaryById(3);
		
		System.out.println(employee.getEmployeeName()+"\t"+employee.getSalary());
		
		ctx.close();
	}

}
