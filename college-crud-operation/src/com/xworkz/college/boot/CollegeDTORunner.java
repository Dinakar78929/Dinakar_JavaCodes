package com.xworkz.college.boot;

import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.college.repo.CollegeRepository;
import com.xworkz.college.repo.CollegeRepositoryImpl;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;

public class CollegeDTORunner {

	public static void main(String[] args) {
		
		CollegeDTO collegeDTO1=new CollegeDTO(701, "ATNCC", "Neharu", "Shivamogga", 15000);
		
		CollegeRepository collegeRepository=new CollegeRepositoryImpl();
		
		CollegeService service=new CollegeServiceImpl(collegeRepository);
		
		boolean save1=service.validateAndSave(collegeDTO1);
		System.out.println(save1);
		
		CollegeDTO dto1=service.find(collegeDTO1);
		System.out.println("DTO1 is:"+dto1);
		
		CollegeDTO idDto11=service.findById(701);
		System.out.println(idDto11);
		
		int findId=service.findIdByNameAndOwner("ATNCC", "Neharu");
		System.out.println("Id is:"+findId);
	}

}
