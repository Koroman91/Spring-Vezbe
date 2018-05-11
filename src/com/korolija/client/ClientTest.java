package com.korolija.client;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Message;


public class ClientTest {
	
	public static void main(String[] args) {
		
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message message = ctx.getBean("message", Message.class);
		

		
		System.out.println(message.getMessageId()+"\t"+message.getMessageName());
		
		((AbstractApplicationContext) ctx).close();
	}

}
