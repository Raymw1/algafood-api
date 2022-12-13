package com.api.algafood.service;

import com.api.algafood.model.Customer;

public class ActivatedCustomerEvent {
	private Customer customer;
	
	public ActivatedCustomerEvent(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
}
