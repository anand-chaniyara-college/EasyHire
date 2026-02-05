package com.ace.job.easyhire.config;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsWithId extends UserDetails {
	int getId();

	void setId(int id);
}
