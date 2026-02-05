package com.ace.job.easyhire.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ace.job.easyhire.entity.PasswordReset;
import com.ace.job.easyhire.entity.User;

public interface PasswordResetRepository extends JpaRepository<PasswordReset, Long> {
	List<PasswordReset> findByUser(User user);

	PasswordReset findByResetToken(String resetToken);

	@Query("SELECT ps FROM PasswordReset ps WHERE resetToken IS NOT NULL")
	List<PasswordReset> findNotNullTokens();
}
