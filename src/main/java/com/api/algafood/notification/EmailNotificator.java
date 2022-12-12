package com.api.algafood.notification;

import com.api.algafood.model.Customer;

public class EmailNotificator {

	public void notificate(Customer customer, String message) {
		System.out.printf("Notifying %s by the email %s: %s\n",
				customer.getName(), customer.getEmail(), message
		);
	}
}
