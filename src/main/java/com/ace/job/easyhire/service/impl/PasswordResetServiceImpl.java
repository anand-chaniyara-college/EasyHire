package com.ace.job.easyhire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.job.easyhire.entity.PasswordReset;
import com.ace.job.easyhire.entity.User;
import com.ace.job.easyhire.repository.PasswordResetRepository;
import com.ace.job.easyhire.service.PasswordResetService;

@Service
public class PasswordResetServiceImpl implements PasswordResetService {
	@Autowired
	PasswordResetRepository passwordResetRepository;

	@Override
	public List<PasswordReset> getByUser(User user) {
		return passwordResetRepository.findByUser(user);
	}

	@Override
	public PasswordReset storePasswordReset(PasswordReset passwordReset) {
		return passwordResetRepository.save(passwordReset);
	}

	@Override
	public PasswordReset getByResetToken(String resetToken) {
		return passwordResetRepository.findByResetToken(resetToken);
	}

	@Override
	public PasswordReset getById(long id) {
		return passwordResetRepository.findById(id).get();
	}

	@Override
	public PasswordReset updatePasswordReset(PasswordReset passwordReset) {
		return passwordResetRepository.save(passwordReset);
	}

	@Override
	public List<PasswordReset> getPasswordResetByNotNullTokens() {
		return passwordResetRepository.findNotNullTokens();
	}

}
