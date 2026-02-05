package com.ace.job.easyhire.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "easyhire_status")
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_id")
	private int id;

	@Column(name = "status_name", nullable = false)
	private String name;

	@OneToMany(mappedBy = "status", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<CandidateStatus> candidateStatusList;

	public List<CandidateStatus> getCandidateStatusList() {
		return candidateStatusList;
	}

	public void setCandidateStatusList(List<CandidateStatus> candidateStatusList) {
		this.candidateStatusList = candidateStatusList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
