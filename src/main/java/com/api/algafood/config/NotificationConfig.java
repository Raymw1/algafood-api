package com.api.algafood.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.api.algafood.notification.EmailNotificator;

@Configuration
public class NotificationConfig {

	@Bean
//	@Primary
	@Qualifier("normal")
	public EmailNotificator emailNotificator() {
		EmailNotificator notificator = new EmailNotificator("smtp.rayanmail.com.br");
		notificator.setUppercase(false);
		return notificator;
	}
}
