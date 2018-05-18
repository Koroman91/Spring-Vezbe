package com.korolija.client;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.UserDetails;




public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserDetails userDetails = ctx.getBean("userBean", UserDetails.class);
		
        System.out.println(userDetails.getUserName()+"\t"+userDetails.getPassword());
		
		((AbstractApplicationContext) ctx).close();
	}

}
