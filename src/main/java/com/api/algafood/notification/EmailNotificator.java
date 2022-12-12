package com.api.algafood.notification;

import com.api.algafood.model.Customer;

public class EmailNotificator implements Notificator {

	private boolean uppercase;
	private String smtpServerHost;
	
	public EmailNotificator(String smtpServerHost) {
		this.smtpServerHost = smtpServerHost;
		System.out.println("EmailNotificator constructor!");
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
