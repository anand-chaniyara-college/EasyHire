package com.ace.job.easyhire.service;

import java.util.List;

import com.ace.job.easyhire.entity.CandidateInterview;

public interface CandidateInterviewService {
	CandidateInterview saveCandidateInterview(CandidateInterview candidateInterview);

	List<CandidateInterview> getCandidateInterviewById(long candidateId);

	List<CandidateInterview> getCandidateInterviewByIdAndInterviewStatus(long candidateId, boolean status);

	List<CandidateInterview> getAll();

	List<CandidateInterview> getAllReviewsByCandidateId(long candidateId);
}
