package com.api.algafood.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.api.algafood.notification.EmailNotificator;
import com.api.algafood.notification.EmailNotificatorMock;
import com.api.algafood.notification.NotificatorType;
import com.api.algafood.notification.UrgencyLevel;

@Configuration
public class NotificationConfig {

	@Bean
//	@Primary
//	@Qualifier("normal")
	@NotificatorType(UrgencyLevel.NORMAL)
	@Profile("prod")
	public EmailNotificator emailNotificator() {
		EmailNotificator notificator = new EmailNotificator("smtp.rayanmail.com.br");
		notificator.setUppercase(false);
		return notificator;
	}
	
	@Bean
	public EmailNotificatorMock emailNotificatorMock() {
		EmailNotificatorMock notificator = new EmailNotificatorMock("smtp.rayanmail.com.br");
		notificator.setUppercase(false);
		return notificator;
	}
}
