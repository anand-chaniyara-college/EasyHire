package com.ace.job.easyhire.service;

import java.util.List;

import com.ace.job.easyhire.entity.CandidateStatus;

public interface CandidateStatusService {
	CandidateStatus saveCandidateStatus(CandidateStatus candidateStatus);

	List<CandidateStatus> getAllByCandidateId(long id);

}
