package com.api.algafood.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;

//@Component
public class EmailNotificator implements Notificator {

	private boolean uppercase;
	private String smtpServerHost;
	
	public EmailNotificator(String smtpServerHost) {
		this.smtpServerHost = smtpServerHost;
	}
	
	@Override
	public void notificate(Customer customer, String message) {
		if (this.uppercase) {
			message = message.toUpperCase();
		}
		
		System.out.printf("Notifying %s by the email %s using SMTP %s: %s\n",
				customer.getName(), customer.getEmail(), this.smtpServerHost, message
		);
	}

	public void setUppercase(boolean uppercase) {
		this.uppercase = uppercase;
	}
}
