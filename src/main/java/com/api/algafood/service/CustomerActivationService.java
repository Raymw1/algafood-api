package com.api.algafood.service;

import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;
import com.api.algafood.notification.Notificator;

@Component
public class CustomerActivationService {
	private Notificator notificator;

	public CustomerActivationService(Notificator notificator) {
		this.notificator = notificator;
		System.out.println("CustomerActivationService constructor!" + notificator);
	}

	public void activate(Customer customer) {
		customer.activate();
		
		notificator.notificate(customer, "Your registration on the platform is active!");
	}
}
