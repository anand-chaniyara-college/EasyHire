package com.ace.job.easyhire.service;

import com.ace.job.easyhire.dto.DashboardCountDTO;

public interface DashboardService {

	// get min year of vacancy
	public int getMinYear();

	public DashboardCountDTO getDashboardCounts(int year);

	public DashboardCountDTO getDashboardCountsForDepartment(int year, int department);

}
