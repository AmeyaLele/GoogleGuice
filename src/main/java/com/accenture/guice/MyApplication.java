package com.accenture.guice;

import javax.inject.Inject;

public class MyApplication {
	
	private MessageService service;

	@Inject
	public MyApplication(MessageService service)
	{
		this.service=service;
	}
	
	public void sendMesage(String msg) {
		this.service.sendMessage(msg);
	}

}
