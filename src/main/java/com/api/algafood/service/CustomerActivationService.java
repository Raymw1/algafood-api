package com.api.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;
import com.api.algafood.notification.Notificator;

@Component
public class CustomerActivationService {
//  --- INJECTION POINT 3 ---
	@Autowired
	private Notificator notificator;

	
//	--- INJECTION POINT 1 ---
//	@Autowired
//	public CustomerActivationService(Notificator notificator) {
//		this.notificator = notificator;
//	}
//	
//	public CustomerActivationService(String string) {
//	}

	
	public void activate(Customer customer) {
		customer.activate();
		
		notificator.notificate(customer, "Your registration on the platform is active!");
	}

	
//	--- INJECTION POINT 2 ---
//	@Autowired
//	public void setNotificator(Notificator notificator) {
//		this.notificator = notificator;
//	}
	
	
}
