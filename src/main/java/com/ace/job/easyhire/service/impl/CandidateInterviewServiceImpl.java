package com.ace.job.easyhire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.job.easyhire.entity.CandidateInterview;
import com.ace.job.easyhire.repository.CandidateInterviewRepository;
import com.ace.job.easyhire.service.CandidateInterviewService;

@Service
public class CandidateInterviewServiceImpl implements CandidateInterviewService {

	@Autowired
	CandidateInterviewRepository candidateInterviewRepository;

	@Override
	public CandidateInterview saveCandidateInterview(CandidateInterview candidateInterview) {
		return candidateInterviewRepository.save(candidateInterview);
	}

	public List<CandidateInterview> getCandidateInterviewById(long candidateId) {
		return candidateInterviewRepository.findByCandidateId(candidateId);
	}

	@Override
	public List<CandidateInterview> getAll() {
		return candidateInterviewRepository.findAll();
	}

	@Override
	public List<CandidateInterview> getCandidateInterviewByIdAndInterviewStatus(long candidateId, boolean status) {
		return candidateInterviewRepository.findByCandidateIdAndInterviewStatus(candidateId, status);
	}

	@Override
	public List<CandidateInterview> getAllReviewsByCandidateId(long candidateId) {
		return candidateInterviewRepository.findReviewsByCandidateId(candidateId);
	}

}
