package com.xworkz.association.service;

import com.xworkz.association.dto.ApplicationDTO;

public interface ApplicationService {
	boolean validateAndThenSave(ApplicationDTO dto);
}
