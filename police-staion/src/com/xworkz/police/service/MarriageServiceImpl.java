package com.xworkz.police.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.xworkz.police.dto.MarriageDTO;
import com.xworkz.police.dto.PoliceStationDTO;
import com.xworkz.police.repo.MarriageRepository;

public class MarriageServiceImpl implements MarriageService{
	private MarriageRepository repo;
	
	
	public MarriageServiceImpl(MarriageRepository repo) {
		this.repo = repo;
	}


	@Override
	public boolean validateAndSave(MarriageDTO dto) {
		System.out.println("Running validateAndSave Method");
		if(dto!=null) {
			System.out.println("dto is not null");
			System.out.println(dto);
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			javax.validation.Validator validator = factory.getValidator();

			Set<ConstraintViolation<MarriageDTO>> constraintViolations = validator.validate(dto);
			//
			System.out.println("Total constraints violation:" + constraintViolations.size());
			constraintViolations.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (constraintViolations != null && constraintViolations.isEmpty()) {
				System.out.println("No constraintViolations found in dto");
				return this.repo.save(dto);

			} 
			else {
				System.out.println("DTO is null");
				
			}
			
		}
		return false;
	}

}
