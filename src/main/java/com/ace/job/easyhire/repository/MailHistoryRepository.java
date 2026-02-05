package com.ace.job.easyhire.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ace.job.easyhire.entity.MailHistory;

public interface MailHistoryRepository
		extends JpaRepository<MailHistory, Long>, DataTablesRepository<MailHistory, Long> {

}
