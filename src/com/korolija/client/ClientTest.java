package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.RandomNumberGenerator;

public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		RandomNumberGenerator randomNumberGenerator = ctx.getBean("randomNumberGenerator", RandomNumberGenerator.class);

		System.out.println(randomNumberGenerator.getRandomNumber());
		System.out.println(randomNumberGenerator.getPi());
	}

}
