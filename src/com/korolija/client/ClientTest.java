package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
	
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = ctx.getBean("employee", Employee.class);

		System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getGender()+"\t"+employee.getPanNo());
	    ctx.close();
	
	}

}
