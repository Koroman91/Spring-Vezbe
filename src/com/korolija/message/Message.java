package com.korolija.message;

import org.springframework.beans.factory.annotation.Required;

public class Message {
	
	private int messageId;
	private String message;
	
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	
	@Required
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
