package com.ace.job.easyhire.service;

import com.ace.job.easyhire.entity.Status;

public interface StatusService {
	Status getStatusById(int id);

	Status addStatus(Status status);

	Status getStatusByName(String name);
}
