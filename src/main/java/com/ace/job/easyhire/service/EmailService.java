package com.ace.job.easyhire.service;

import javax.mail.MessagingException;

import org.springframework.security.core.Authentication;

import com.ace.job.easyhire.entity.User;
import com.ace.job.easyhire.model.Email;

public interface EmailService {

	public User getCurrentUser(Authentication authentication);

	public String sendMail(String toEmail, String subject, String body) throws MessagingException;

	public String sendMailWithCCAttachment(Email email);

	public String validateCCAndAttachment(String[] ccAddress, String[] attachment);
}
