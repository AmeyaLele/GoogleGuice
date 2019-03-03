package com.accenture.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApplication {

	public static void main(String[] args) {
			
		Injector injector =Guice.createInjector(new BeanInjector());
		MyApplication app = injector.getInstance(MyApplication.class);
		//MyApplication app = new MyApplication(service) - needs hardcoded init of service
		app.sendMesage("Test Message");
	}

}
