package com.accenture.guice;

public class EmailService implements MessageService {

	public boolean sendMessage(String message) {
		
		System.out.println("Email Sent - "+message);
		return true;
	}

}
