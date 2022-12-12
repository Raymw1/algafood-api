package com.api.algafood.notification;

import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;

@Component
public class EmailNotificator implements Notificator {

	public EmailNotificator() {
		System.out.println("EmailNotificator constructor!");
	}
	
	@Override
	public void notificate(Customer customer, String message) {
		System.out.printf("Notifying %s by the email %s: %s\n",
				customer.getName(), customer.getEmail(), message
		);
	}
}
