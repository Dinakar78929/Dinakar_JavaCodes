package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDTO;

public interface CollegeService {
	
	boolean validateAndSave(CollegeDTO dto);
	CollegeDTO find (CollegeDTO dto);
	CollegeDTO findByName(String name);
	CollegeDTO findById(int id);
	CollegeDTO findByNameAndOwner(String name,String owner);
	double findFeesByName(String name,int id);
	int findIdByNameAndOwner(String name,String owner);
	int total();
	

}
