package com.korolija.service;

import com.korolija.message.Messenger;

public class Communication {
	
	private Messenger message;

	

	public Communication(Messenger message) {
		super();
		this.message = message;
	}



	public void communicate()
	{
		message.sendMessage();
	}

}
