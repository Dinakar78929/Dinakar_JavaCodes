package com.xworkz.police.boot;

import java.time.LocalDate;

import com.xworkz.police.dto.MarriageDTO;
import com.xworkz.police.repo.MarriageRepository;
import com.xworkz.police.repo.MarriageRepositoryImpl;
import com.xworkz.police.service.MarriageService;
import com.xworkz.police.service.MarriageServiceImpl;

public class MarriageRunner {
	public static void main(String[] args) {
		
		MarriageRepository repository=new MarriageRepositoryImpl();
		
		MarriageService service=new MarriageServiceImpl(repository);
		
		MarriageDTO dto1= new MarriageDTO(11, "Sanjana", "Sanjay", false, LocalDate.of(2010, 1, 1), "VaibhavConvention", 1500, false);
		boolean save1=service.validateAndSave(dto1);
		System.out.println("DTO1 is saved:"+save1);
		
		MarriageDTO dto2= new MarriageDTO(15, "Dharshini", "Darshan", false, LocalDate.of(2022, 5, 3), "JhonCovenction", 2000, false);
		boolean save2=service.validateAndSave(dto2);
		System.out.println("DTO2 is saved:"+save2);
	}
}
