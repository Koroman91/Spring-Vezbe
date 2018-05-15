package com.korolija.client;



import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Message;


public class ClientTest {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		ctx.start();
		Message message = ctx.getBean("message", Message.class);
		
		System.out.println("---------------------");

		
		System.out.println(message.getMessageId()+"\t"+message.getMessageName());
		
		System.out.println("---------------------");

		
		ctx.stop();
		
		ctx.close();
	}
}
