package com.korolija.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.spring.Poruka;

public class ClientTest {
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Poruka message = ctx.getBean("message", Poruka.class);
		
		
		message.setMessageId(1001);
		message.setMessage("Hello!!!");
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		
		Poruka message1 = ctx.getBean("message", Poruka.class);
		
		//message1.setMessageId(1002);
		//message1.setMessage("World!!!");
		
		System.out.println(message1.getMessageId()+"\t"+message1.getMessage());

		((AbstractApplicationContext) ctx).close();
	}

}
