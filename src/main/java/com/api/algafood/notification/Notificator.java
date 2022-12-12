package com.api.algafood.notification;

import com.api.algafood.model.Customer;

public interface Notificator {

	void notificate(Customer customer, String message);

}