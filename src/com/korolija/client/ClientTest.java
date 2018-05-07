package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.service.Communication;

public class ClientTest {

	public static void main(String[] args) {

		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Communication communication = ctx.getBean("communication", Communication.class);
		communication.communitcate();
		ctx.close();
	}

}
