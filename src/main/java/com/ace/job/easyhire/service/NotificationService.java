package com.ace.job.easyhire.service;

import java.time.LocalDateTime;
import java.util.List;

import com.ace.job.easyhire.entity.Notification;
import com.ace.job.easyhire.entity.User;
import com.ace.job.easyhire.entity.Vacancy;

public interface NotificationService {

	void createNotification(String message, LocalDateTime createdAt, Vacancy vacancy);

	void updateNotificationStatus(Notification notification, List<User> user);

	Notification getNotificationById(long id);

	List<Notification> getAllNotifications();

	List<Notification> getAllByUserId(int id);
}
