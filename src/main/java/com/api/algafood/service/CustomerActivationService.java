package com.api.algafood.service;

import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;
import com.api.algafood.notification.EmailNotificator;

@Component
public class CustomerActivationService {
	private EmailNotificator notificator;
	
	public void activate(Customer customer) {
		customer.activate();
		
		notificator.notificate(customer, "Your registration on the platform is active!");
	}
}
