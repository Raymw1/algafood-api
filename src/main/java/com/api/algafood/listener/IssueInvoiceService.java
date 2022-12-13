package com.api.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.api.algafood.notification.Notificator;
import com.api.algafood.notification.NotificatorType;
import com.api.algafood.notification.UrgencyLevel;
import com.api.algafood.service.ActivatedCustomerEvent;

@Component
public class IssueInvoiceService {
	
	@NotificatorType(UrgencyLevel.NORMAL)
	@Autowired
	private Notificator notificator;
	
	@EventListener
	public void activatedCustomerListener(ActivatedCustomerEvent event) {
		System.out.println("Issuing invoice for the customer " + event.getCustomer().getName());
	}
}
