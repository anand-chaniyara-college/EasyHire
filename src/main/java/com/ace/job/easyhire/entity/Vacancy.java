package com.ace.job.easyhire.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "easyhire_vacancy")
public class Vacancy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vacancy_id")
	private long id;
	@Column(name = "vacancy_requirement", columnDefinition = "LONGTEXT", nullable = false)
	private String requirement;
	@Column(name = "vacancy_responsibility", columnDefinition = "LONGTEXT", nullable = false)
	private String responsibility;
	@Column(name = "vacancy_description", columnDefinition = "LONGTEXT", nullable = false)
	private String description;
	@Column(name = "vacancy_preference", columnDefinition = "LONGTEXT")
	private String preference;
	@Column(name = "vacancy_start_working_day", length = 70, nullable = false)
	private String startWorkingDay;
	@Column(name = "vacancy_end_working_day", length = 70, nullable = false)
	private String endWorkingDay;
	@Column(name = "vacancy_start_working_hour", length = 50, nullable = false)
	private String startWorkingHour;
	@Column(name = "vacancy_end_working_hour", length = 50, nullable = false)
	private String endWorkingHour;
	@Column(name = "vacancy_salary", length = 50, nullable = false)
	private String salary;
	@Column(name = "vacancy_count", nullable = false)
	private int count;
	@Column(name = "vacancy_type", length = 50, nullable = false)
	private String type;
	@Column(name = "vacancy_reopen_status")
	private boolean reopenStatus;

	@Column(name = "vacancy_reopened")
	private boolean reopened;

	@Column(name = "vacancy_created_date", nullable = false)
	private LocalDate createdDate;

	@Column(name = "vacancy_created_time", nullable = false)
	private LocalTime createdTime;

	@Column(name = "vacancy_updated_date")
	private LocalDate updatedDate;

	@Column(name = "vacancy_updated_time")
	private LocalTime updatedTime;

	@Column(name = "vacancy_created_user_id", nullable = false)
	private int createdUserId;

	@Column(name = "vacancy_updated_user_id")
	private int updatedUserId;

	@Column(name = "vacancy_due_date", nullable = false)
	private LocalDate dueDate;

	@Column(name = "vacancy_active", nullable = false)
	private boolean active;

	@Column(name = "vacancy_urgent", nullable = false)
	private boolean urgent;

	@Column(name = "vacancy_reopen_date")
	private LocalDate reopenDate;

	@Column(name = "vacancy_reopen_time")
	private LocalTime reopenTime;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "vacancy_department_id", nullable = false)
	@JsonManagedReference
	private Department department;

	@OneToMany(mappedBy = "vacancy", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Candidate> candidates;

	@OneToMany(mappedBy = "vacancy", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Notification> notification;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "vacancy_position_id", nullable = false)
	@JsonManagedReference
	private Position position;

	public Vacancy() {
	}

	public Vacancy(String requirement, String responsibility, String description, String preference,
			String startWorkingDay, String endWorkingDay, String startWorkingHour, String endWorkingHour, String salary,
			int count, String type, boolean reopenStatus, boolean reopened, LocalDate createdDate,
			LocalTime createdTime, LocalDate updatedDate, LocalTime updatedTime, int createdUserId, int updatedUserId,
			LocalDate dueDate, boolean active, boolean urgent, LocalDate reopenDate, LocalTime reopenTime,
			Department department, List<Candidate> candidates, Position position) {
		super();
		this.requirement = requirement;
		this.responsibility = responsibility;
		this.description = description;
		this.preference = preference;
		this.startWorkingDay = startWorkingDay;
		this.endWorkingDay = endWorkingDay;
		this.startWorkingHour = startWorkingHour;
		this.endWorkingHour = endWorkingHour;
		this.salary = salary;
		this.count = count;
		this.type = type;
		this.reopenStatus = reopenStatus;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		this.createdUserId = createdUserId;
		this.updatedUserId = updatedUserId;
		this.dueDate = dueDate;
		this.reopenDate = reopenDate;
		this.reopenTime = reopenTime;
		this.department = department;
		this.candidates = candidates;
		this.position = position;
		this.active = active;
		this.urgent = urgent;
		this.reopened = reopened;
	}

	public Vacancy(long id, String requirement, String responsibility, String description, String preference,
			String startWorkingDay, String endWorkingDay, String startWorkingHour, String endWorkingHour, String salary,
			int count, String type, boolean reopenStatus, boolean reopened, LocalDate createdDate,
			LocalTime createdTime, LocalDate updatedDate, LocalTime updatedTime, int createdUserId, int updatedUserId,
			LocalDate dueDate, boolean active, boolean urgent, LocalDate reopenDate, LocalTime reopenTime,
			Department department, List<Candidate> candidates, Position position) {
		super();
		this.id = id;
		this.requirement = requirement;
		this.responsibility = responsibility;
		this.description = description;
		this.preference = preference;
		this.startWorkingDay = startWorkingDay;
		this.endWorkingDay = endWorkingDay;
		this.startWorkingHour = startWorkingHour;
		this.endWorkingHour = endWorkingHour;
		this.salary = salary;
		this.count = count;
		this.type = type;
		this.reopenStatus = reopenStatus;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		this.createdUserId = createdUserId;
		this.updatedUserId = updatedUserId;
		this.dueDate = dueDate;
		this.reopenDate = reopenDate;
		this.reopenTime = reopenTime;
		this.department = department;
		this.candidates = candidates;
		this.position = position;
		this.active = active;
		this.urgent = urgent;
		this.reopened = reopened;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getStartWorkingDay() {
		return startWorkingDay;
	}

	public void setStartWorkingDay(String startWorkingDay) {
		this.startWorkingDay = startWorkingDay;
	}

	public String getEndWorkingDay() {
		return endWorkingDay;
	}

	public void setEndWorkingDay(String endWorkingDay) {
		this.endWorkingDay = endWorkingDay;
	}

	public String getStartWorkingHour() {
		return startWorkingHour;
	}

	public void setStartWorkingHour(String startWorkingHour) {
		this.startWorkingHour = startWorkingHour;
	}

	public String getEndWorkingHour() {
		return endWorkingHour;
	}

	public void setEndWorkingHour(String endWorkingHour) {
		this.endWorkingHour = endWorkingHour;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isReopenStatus() {
		return reopenStatus;
	}

	public void setReopenStatus(boolean reopenStatus) {
		this.reopenStatus = reopenStatus;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalTime createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalTime getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(LocalTime updatedTime) {
		this.updatedTime = updatedTime;
	}

	public int getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(int createdUserId) {
		this.createdUserId = createdUserId;
	}

	public int getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(int updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getReopenDate() {
		return reopenDate;
	}

	public void setReopenDate(LocalDate reopenDate) {
		this.reopenDate = reopenDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalTime getReopenTime() {
		return reopenTime;
	}

	public void setReopenTime(LocalTime reopenTime) {
		this.reopenTime = reopenTime;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public List<Notification> getNotification() {
		return notification;
	}

	public void setNotification(List<Notification> notification) {
		this.notification = notification;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public boolean isReopened() {
		return reopened;
	}

	public void setReopened(boolean reopened) {
		this.reopened = reopened;
	}

}
