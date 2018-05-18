package com.korolija.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.message.Message;


public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message message = ctx.getBean("message", Message.class);
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		((AbstractApplicationContext) ctx).close();
	}

}
