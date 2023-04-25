package com.xworkz.police.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.xworkz.police.dto.AmbulanceDTO;
import com.xworkz.police.repo.AmbulanceRepository;

public class AmbulanceServiceImpl implements AmbulanceService {
	private AmbulanceRepository repo;

	public AmbulanceServiceImpl(AmbulanceRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(AmbulanceDTO dto) {

		if (dto != null) {
			System.out.println("dto is not null we can save data :" + dto);

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

			javax.validation.Validator validator = factory.getValidator();
			Set<ConstraintViolation<AmbulanceDTO>> constraintViolations = validator.validate(dto);

			System.out.println("Total violation :" + constraintViolations.size());
			constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + "   " + cv.getMessage()));
			if (constraintViolations != null && constraintViolations.isEmpty()) {
				System.out.println("No violation constraints found in dto ");
				return this.repo.save(dto);
			}

		} else {
			System.err.println("dto is not null we cannot save data");
		}
		return false;
	}

}
