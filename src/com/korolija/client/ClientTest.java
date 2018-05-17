package com.korolija.client;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.ExaminationResult;

import java.lang.String;


public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
        ExaminationResult bean = ctx.getBean("examinationResult", ExaminationResult.class);
	
	    System.out.println(bean.getResultMessage());
	    System.out.println(bean.getHasPassed());
	
	}

}
