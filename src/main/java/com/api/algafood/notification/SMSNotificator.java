package com.api.algafood.notification;

import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;

@Component
public class SMSNotificator implements Notificator {
	
	public SMSNotificator() {
	}
	
	@Override
	public void notificate(Customer customer, String message) {		
		System.out.printf("Notifying %s by SMS the phone %s: %s\n",
				customer.getName(), customer.getPhone(), message
		);
	}
}
