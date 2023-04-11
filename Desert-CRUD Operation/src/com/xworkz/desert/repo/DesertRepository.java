package com.xworkz.desert.repo;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.exception.MemoryFullException;

public interface DesertRepository {

	boolean save(DesertDTO dto) throws MemoryFullException;

	default boolean isExist(DesertDTO dto) {
		return false;
	}

	DesertDTO find(DesertDTO dto);

	DesertDTO findByName(String name);

	double findAreaByName(String name);

	DesertDTO findByNameAndCountryAndArea(String name, String country, double area);

	int total();

}
