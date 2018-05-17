package com.korolija.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.korolija.model.TelephoneDirectoryAccessor;

public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		TelephoneDirectoryAccessor telephoneDirectoryAccessor = ctx.getBean("telephoneDirectoryAccessor", TelephoneDirectoryAccessor.class);
		
		
		
		System.out.println("Stefan's contact number is: ");
		
        System.out.println(telephoneDirectoryAccessor.getTelephoneNumber());

		
		ctx.close();
	   }
	}

