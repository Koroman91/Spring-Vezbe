package com.korolija.model;

public class Message {
	
	private int messageId;
	private String messageName;
	
	public Message() {
		System.out.println("Constructor!");
	}
	
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		System.out.println("setMessageId");
		this.messageId = messageId;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		System.out.println("setMessage");
		this.messageName = messageName;
	}
	
	public void init() {
		System.out.println("Bean is going through init");
	}
	
	public void destroy() {
		System.out.println("Bean is going to destroy");
	}
	

}
