package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.ATM;

public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		ATM atm = ctx.getBean("atm", ATM.class);
		
		atm.printBalanceInformation("KORO1991");
		
		ctx.close();
	}

}
