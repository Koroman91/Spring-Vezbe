package com.korolija.message;

public class StefanMessage implements Messenger {
	
	/* (non-Javadoc)
	 * @see com.korolija.message.Messenger#sendMessage()
	 */
	@Override
	public void sendMessage() {
		
		System.out.println("Sending message with Active Stefan!");
	}

}
