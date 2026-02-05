package com.ace.job.easyhire.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ace.job.easyhire.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	List<Notification> findAllByStatus(boolean status);

	List<Notification> findAllByUserId(int id);

	Notification findById(long id);

}
