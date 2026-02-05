package com.ace.job.easyhire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.job.easyhire.entity.CandidateStatus;
import com.ace.job.easyhire.repository.CandidateStatusRepository;
import com.ace.job.easyhire.service.CandidateStatusService;

@Service
public class CandidateStatusServiceImpl implements CandidateStatusService {

	@Autowired
	CandidateStatusRepository candidateStatusRepository;

	@Override
	public CandidateStatus saveCandidateStatus(CandidateStatus candidateStatus) {
		return candidateStatusRepository.save(candidateStatus);
	}

	@Override
	public List<CandidateStatus> getAllByCandidateId(long id) {
		return candidateStatusRepository.findByCandidateId(id);
	}

}
