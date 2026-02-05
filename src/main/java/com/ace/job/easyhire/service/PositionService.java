package com.ace.job.easyhire.service;

import java.util.List;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.security.core.Authentication;

import com.ace.job.easyhire.entity.Position;

public interface PositionService {
	public int getCurrentUserId(Authentication authentication);

	Position addPosition(Position position);

	Position getPositionById(int id);

	List<Position> getPositionByName(String name);

	Position updatePosition(Position position);

	DataTablesOutput<Position> getDataTableData(DataTablesInput input);

	List<Position> getAllPositions();

}
