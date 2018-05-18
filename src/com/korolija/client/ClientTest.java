package com.korolija.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Employee;
import com.korolija.model.Pancard;


public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee employee = ctx.getBean("employee", Employee.class);
		
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		
		System.out.println("--------------");
		
		Pancard pancard = employee.getPancard();
		if (pancard != null) {
			System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		}
		else {
			System.out.println("Pancard not available!");
		}
		((AbstractApplicationContext) ctx).close();
	}

}
