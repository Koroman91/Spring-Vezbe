package com.korolija.message;

public class ActiveMQMessage implements Messenger {

	@Override
	public void sendMessage() {
		System.out.println("Sending Message with Active MQ");

	}

}
