package com.korolija.service;

import com.korolija.message.Messenger;

public class Communication {
	
	private Messenger messenger;
	
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void communitcate() {
		messenger.sendMessage();
	}

}
