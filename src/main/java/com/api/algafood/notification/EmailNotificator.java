package com.api.algafood.notification;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;

//@Component
public class EmailNotificator implements Notificator, InitializingBean, DisposableBean {

	private boolean uppercase;
	
	@Value("${notificator.email.server-host}")
	private String serverHost;
	
	@Value("${notificator.email.server-port}")
	private Integer serverPort;
	
	public EmailNotificator(String serverHost) {
		this.serverHost = serverHost;
	}
	
	@Override
	public void notificate(Customer customer, String message) {
		if (this.uppercase) {
			message = message.toUpperCase();
		}
		
		System.out.println("Host: " + serverHost);

		System.out.println("Port: " + serverPort);
		
		System.out.printf("Notifying %s by the email %s using SMTP %s: %s\n",
				customer.getName(), customer.getEmail(), this.serverHost, message
		);
	}

	public void setUppercase(boolean uppercase) {
		this.uppercase = uppercase;
	}

	// ON INIT BEAN
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT NOTIFICATOR");
	}

	// ON DESTROY BEAN
	@Override
	public void destroy() throws Exception {
		System.out.println("DESTROY NOTIFICATOR");
	}
}
