package com.api.algafood.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;

//@Component
@NotificatorType(UrgencyLevel.NORMAL)
@Profile("dev")
public class EmailNotificatorMock implements Notificator {

	private boolean uppercase;
	private String smtpServerHost;
	
	public EmailNotificatorMock(String smtpServerHost) {
		this.smtpServerHost = smtpServerHost;
		System.out.println("EmailNotificator MOCK!");
	}
	
	@Override
	public void notificate(Customer customer, String message) {
		if (this.uppercase) {
			message = message.toUpperCase();
		}
		
		System.out.printf("MOCK: Notification would be sent to %s by the email %s using SMTP %s: %s\n",
				customer.getName(), customer.getEmail(), this.smtpServerHost, message
		);
	}

	public void setUppercase(boolean uppercase) {
		this.uppercase = uppercase;
	}
}
