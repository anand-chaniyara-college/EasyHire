package com.ace.job.easyhire.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.job.easyhire.entity.Reviews;
import com.ace.job.easyhire.repository.ReviewRepository;
import com.ace.job.easyhire.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewRepository reviewRepository;

	@Override
	public Reviews saveReview(Reviews reviews) {
		return reviewRepository.save(reviews);
	}

}
