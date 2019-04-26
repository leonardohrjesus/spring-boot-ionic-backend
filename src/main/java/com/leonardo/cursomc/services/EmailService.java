package com.leonardo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.leonardo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);

}
