package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.EmailValidator;

public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		EmailValidator emailValidator = ctx.getBean("emailValidator", EmailValidator.class);
		
		System.out.println(emailValidator.getIsValidEmail());
		
		ctx.close();
	}

}
