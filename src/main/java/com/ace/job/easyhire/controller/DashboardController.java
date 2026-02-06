package com.ace.job.easyhire.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ace.job.easyhire.dto.DashboardCountDTO;
import com.ace.job.easyhire.entity.Department;
import com.ace.job.easyhire.entity.Position;
import com.ace.job.easyhire.model.AppUserDetails;
import com.ace.job.easyhire.service.ChartService;
import com.ace.job.easyhire.service.DashboardService;
import com.ace.job.easyhire.service.DepartmentService;
import com.ace.job.easyhire.service.PositionService;

@Controller
public class DashboardController {
	@Autowired
	DashboardService dashboardService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	PositionService positionService;
	@Autowired
	ChartService chartService;

	@GetMapping("/dashboard")
	public String defaultDashboard(Authentication authentication) {
		if (authentication != null && authentication.getAuthorities().stream()
				.anyMatch(a -> a.getAuthority().equals("Interviewer")
						|| a.getAuthority().equals("Department-head"))) {
			return "redirect:/department/dashboard";
		}
		return "redirect:/hr/dashboard";
	}

	@GetMapping("/hr/dashboard")
	public String showDashboardHR(Model model) {
		int minYear = dashboardService.getMinYear();
		model.addAttribute("minYear", minYear);

		List<Department> departmentListForChart = new ArrayList<Department>();
		departmentListForChart = departmentService.getDepartments();
		model.addAttribute("departmentListForChart", departmentListForChart);

		List<Position> positionListForChart = new ArrayList<Position>();
		positionListForChart = positionService.getAllPositions();
		model.addAttribute("positionListForChart", positionListForChart);

		return "dashboard/dashboard";
	}

	@GetMapping("/hr/dashboard-counts/{year}")
	public ResponseEntity<DashboardCountDTO> getDashboardCounts(@PathVariable("year") int year) {
		DashboardCountDTO dashboardCountDTO = new DashboardCountDTO();
		dashboardCountDTO = dashboardService.getDashboardCounts(year);
		return ResponseEntity.ok(dashboardCountDTO);
	}

	@GetMapping("/department/dashboard")
	public String showDashboardByDepartment(Model model, Authentication authentication) {
		int minYear = dashboardService.getMinYear();
		model.addAttribute("minYear", minYear);

		// get current department name
		AppUserDetails appUserDetails = (AppUserDetails) authentication.getPrincipal();
		String departmentName = appUserDetails.getUser().getDepartment().getName();

		List<Position> positionListForChart = new ArrayList<Position>();
		positionListForChart = positionService.getAllPositions();
		model.addAttribute("positionListForChart", positionListForChart);
		model.addAttribute("departmentName", departmentName);

		return "dashboard/dashboard-department";
	}

	@GetMapping("/department/dashboard-counts/{year}")
	public ResponseEntity<DashboardCountDTO> getDashboardCountsForDepartment(@PathVariable("year") int year,
			Authentication authentication) {
		int departmentId = chartService.getCurrentDepartmentId(authentication);

		DashboardCountDTO dashboardCountDTO = new DashboardCountDTO();
		dashboardCountDTO = dashboardService.getDashboardCountsForDepartment(year, departmentId);
		return ResponseEntity.ok(dashboardCountDTO);
	}

}
