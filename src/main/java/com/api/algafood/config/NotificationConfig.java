package com.api.algafood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.algafood.notification.EmailNotificator;

@Configuration
public class NotificationConfig {

	@Bean
	public EmailNotificator emailNotificator() {
		EmailNotificator notificator = new EmailNotificator("smtp.rayanmail.com.br");
		notificator.setUppercase(false);
		return notificator;
	}
}
