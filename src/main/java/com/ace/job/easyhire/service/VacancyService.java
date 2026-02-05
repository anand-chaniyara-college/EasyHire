package com.ace.job.easyhire.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.ace.job.easyhire.dto.VacancyDTO;
import com.ace.job.easyhire.dto.VacancyForInterviewDTO;
import com.ace.job.easyhire.entity.Department;
import com.ace.job.easyhire.entity.Position;
import com.ace.job.easyhire.entity.Vacancy;

public interface VacancyService {

	void addVacancyAndNotify(VacancyDTO dto, String message);

	void editVacancyAndNotify(VacancyDTO dto, String message);

	void updateVacancy(VacancyDTO dto);

	List<Vacancy> getAllVacancy();

	List<Vacancy> getUrgentVacancy();

	VacancyDTO getVacancyById(long id);

	LocalDateTime getCurrentDateTime();

	LocalDate getCurrentDate();

	LocalTime getCurrentTime();

	String convertToFormattedTime(String timeString);

	void markVacanciesAsInactiveAfter30Days();

	int calculateDaysLeft(LocalDate createdDate);

	List<String> trimArray(String[] array);

	Vacancy getVacancyByIdForInterview(long id);

	List<VacancyForInterviewDTO> getVacanciesForInterview();

	Vacancy getVacancyByIdWithEntity(long id);

	List<Vacancy> getAllActiveVacancy();

	DataTablesOutput<Vacancy> getVacancyByDateFilter(@Valid DataTablesInput input, LocalDate startDateFrom,
			LocalDate endDateTo);

	DataTablesOutput<Vacancy> getVacancyByStatus(@Valid DataTablesInput input, String status);

	DataTablesOutput<Vacancy> getVacancyByDateFilterAndStatus(@Valid DataTablesInput input, LocalDate startDateFrom,
			LocalDate endDateTo, String status);

	// for chart
	List<Vacancy> getVacancyByDepartmentAndPosition(Department department, Position position);

	List<VacancyForInterviewDTO> getVacanciesForInterview(LocalDate threeMonthsAgo);

	List<VacancyForInterviewDTO> getVacanciesForInterviewUpdate(LocalDate threeMonthsAgo, long vacancyId);
}
