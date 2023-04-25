package com.xworkz.police.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import org.hibernate.validator.internal.metadata.facets.Validatable;

import com.xworkz.police.dto.PoliceStationDTO;
import com.xworkz.police.repo.PoliceStationRepository;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationRepository repo;

	public PoliceStationServiceImpl() {

	}

	public PoliceStationServiceImpl(PoliceStationRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {
		System.out.println("Runninge validate and save method");
		if (dto != null) {
			System.out.println("Dto is not null,we can validate:"+dto);

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			javax.validation.Validator validator = factory.getValidator();

			Set<ConstraintViolation<PoliceStationDTO>> constraintViolations = validator.validate(dto);
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
