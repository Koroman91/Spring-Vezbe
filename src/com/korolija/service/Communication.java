package com.korolija.service;

import com.korolija.message.ActiveMQMessage;

public class Communication {
	
	private ActiveMQMessage activeMQMessage;

	public Communication(ActiveMQMessage activeMQMessage) {
		super();
		this.activeMQMessage = activeMQMessage;
	}

	public void communicate()
	{
		activeMQMessage.sendMessage();
	}

}
