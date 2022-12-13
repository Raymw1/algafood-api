package com.api.algafood.notification;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.api.algafood.model.Customer;

//@Component
public class EmailNotificator implements Notificator, InitializingBean, DisposableBean {

	private boolean uppercase;
	private String smtpServerHost;
	
	public EmailNotificator(String smtpServerHost) {
		this.smtpServerHost = smtpServerHost;
	}
	
	@Override
	public void notificate(Customer customer, String message) {
		if (this.uppercase) {
			message = message.toUpperCase();
		}
		
		System.out.printf("Notifying %s by the email %s using SMTP %s: %s\n",
				customer.getName(), customer.getEmail(), this.smtpServerHost, message
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
