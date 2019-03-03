package com.accenture.guice;

import javax.inject.Singleton;

@Singleton
public class TwitterService implements MessageService {

	public boolean sendMessage(String message) {
		
		System.out.println("Tweet Sent - "+message);
		return true;
	}

}
