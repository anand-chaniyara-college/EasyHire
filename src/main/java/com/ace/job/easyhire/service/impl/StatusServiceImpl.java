package com.ace.job.easyhire.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.job.easyhire.entity.Status;
import com.ace.job.easyhire.repository.StatusRepository;
import com.ace.job.easyhire.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

	@Autowired
	StatusRepository statusRepository;

	@Override
	public Status getStatusById(int id) {
		return statusRepository.findById(id).get();
	}

	@Override
	public Status addStatus(Status status) {
		return statusRepository.save(status);
	}

	@Override
	public Status getStatusByName(String name) {
		return statusRepository.findByName(name);
	}

}
