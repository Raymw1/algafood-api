package com.api.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.algafood.model.Customer;
import com.api.algafood.service.CustomerActivationService;

@Controller
public class MyFirstController {
	
	private CustomerActivationService customerActivationService;

	public MyFirstController(CustomerActivationService customerActivationService) {
		this.customerActivationService = customerActivationService;
		System.out.println("MyFirstController constructor!" + customerActivationService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public Customer hello() {
		Customer customer = new Customer("Rayan", "rayan@rayan.com", "99999999999");
		customerActivationService.activate(customer);
		return customer;
	}
}
