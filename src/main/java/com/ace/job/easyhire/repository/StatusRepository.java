package com.ace.job.easyhire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ace.job.easyhire.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
	Status findByName(String name);
}
