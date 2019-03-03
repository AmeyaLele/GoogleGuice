package com.accenture.guice;

import com.google.inject.AbstractModule;

public class BeanInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);

	}

}
