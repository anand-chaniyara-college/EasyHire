package com.ace.job.easyhire.service;

import java.util.List;

import com.ace.job.easyhire.entity.PasswordReset;
import com.ace.job.easyhire.entity.User;

public interface PasswordResetService {
	public List<PasswordReset> getByUser(User user);

	public PasswordReset storePasswordReset(PasswordReset passwordReset);

	public PasswordReset updatePasswordReset(PasswordReset passwordReset);

	public PasswordReset getByResetToken(String resetToken);

	public PasswordReset getById(long id);

	public List<PasswordReset> getPasswordResetByNotNullTokens();

}
