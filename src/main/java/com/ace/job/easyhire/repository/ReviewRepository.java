package com.ace.job.easyhire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ace.job.easyhire.entity.Reviews;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Long> {

}
