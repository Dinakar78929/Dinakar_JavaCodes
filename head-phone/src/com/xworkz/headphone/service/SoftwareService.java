package com.xworkz.headphone.service;

import com.xworkz.headphone.dto.SoftwareDTO;

public interface SoftwareService {
	boolean validateAndThenSave(SoftwareDTO dto);

}
