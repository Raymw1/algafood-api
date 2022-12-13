package com.api.algafood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.algafood.notification.EmailNotificator;
import com.api.algafood.service.CustomerActivationService;

//@Configuration
public class AlgaConfig {

	@Bean
	public EmailNotificator emailNotificator() {
		EmailNotificator notificator = new EmailNotificator();
		notificator.setUppercase(false);
		return notificator;
	}
	
//	@Bean
//	public CustomerActivationService customerActivationService() {
//		return new CustomerActivationService(emailNotificator());
//	}
}
