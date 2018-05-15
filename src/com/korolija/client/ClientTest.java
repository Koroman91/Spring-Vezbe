package com.korolija.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Ticket;
import com.korolija.model.TicketVendingMachine;

public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		TicketVendingMachine ticketVendingMachine = ctx.getBean("ticketVendingMachine", TicketVendingMachine.class);
		
		Ticket ticket = ticketVendingMachine.generateTicket();
		
		System.out.println(ticket.printTicket());
		ctx.close();
	}

}
