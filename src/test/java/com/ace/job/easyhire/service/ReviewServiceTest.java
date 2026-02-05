package com.ace.job.easyhire.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import com.ace.job.easyhire.entity.Candidate;
import com.ace.job.easyhire.entity.CandidateInterview;
import com.ace.job.easyhire.entity.Interview;
import com.ace.job.easyhire.entity.Reviews;
import com.ace.job.easyhire.entity.Vacancy;
import com.ace.job.easyhire.repository.ReviewRepository;

@SpringBootTest
@Transactional
@DirtiesContext
public class ReviewServiceTest {

	@Autowired
	private ReviewService reviewService;

	@Autowired
	private ReviewRepository reviewRepo;

	@Test
	public void testSaveReview() {
		Vacancy vacancy = new Vacancy();
		vacancy.setId(1);

		Candidate candidate = new Candidate();
		candidate.setId(1);

		Interview interview = new Interview();
		interview.setId(1);
		interview.setStatus(true);
		interview.setCreatedDateTime("2023");
		interview.setStartDate(LocalDate.now());
		interview.setCreatedUserId(1);
		interview.setType("online");
		interview.setStage(1);
		interview.setStartTime("1:00");
		interview.setEndTime("2:00");
		interview.setVacancy(vacancy);

		CandidateInterview candidateInterview = new CandidateInterview();
		candidateInterview.setId(1);
		candidateInterview.setInterviewDate("2023");
		candidateInterview.setInterviewStatusChangedUserId(1);
		candidateInterview.setStatus("Reached");
		candidateInterview.setInterview(interview);

		Reviews review = new Reviews();
		review.setReview("review");
		review.setReviewBy(1);
		review.setReviewedDateTime("2023");
		review.setCandidateInterview(candidateInterview);

		Reviews saveReview = reviewService.saveReview(review);

		Reviews fetchedReview = reviewRepo.findById(saveReview.getId()).orElse(null);

		assertEquals(saveReview.getId(), fetchedReview.getId());

	}

}
