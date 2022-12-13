package com.api.algafood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;
import com.api.algafood.notification.Notificator;
import com.api.algafood.notification.NotificatorType;
import com.api.algafood.notification.UrgencyLevel;

@Component
public class CustomerActivationService {

//	--- INJECTION POINT 1 ---
//	private Notificator notificator;
//	@Autowired
//	public CustomerActivationService(Notificator notificator) {
//		this.notificator = notificator;
//	}
//	
//	public CustomerActivationService(String string) {
//	}
	
//  --- INJECTION POINT 3 ---
	@NotificatorType(UrgencyLevel.NORMAL)
	@Autowired(required = false)
	private Notificator notificator;

//	@Autowired
//	private List<Notificator> notificators;

	
	public void activate(Customer customer) {
		customer.activate();
		
//		for (Notificator notificator : notificators) {
//			notificator.notificate(customer, "Your registration on the platform is active!");
//		}
		
		if (notificator != null) {
			notificator.notificate(customer, "Your registration on the platform is active!");
		}	else {
			System.out.println("There isn't a notificator, but the customer have been activated.");
		}
		
	}

	
//	--- INJECTION POINT 2 ---
//	@Autowired
//	public void setNotificator(Notificator notificator) {
//		this.notificator = notificator;
//	}
	
	
}
