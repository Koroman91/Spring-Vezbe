package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.PerimeterCalculation;

public class ClientTest {

	public static void main(String[] args) {
		
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
	
	PerimeterCalculation perimeterCalculation = ctx.getBean("perimeterCalculation", PerimeterCalculation.class);

	System.out.println(perimeterCalculation.getPerimeter());
	}

}
