package com.xworkz.police.service;

import com.xworkz.police.dto.AmbulanceDTO;

public interface AmbulanceService {
	boolean validateAndSave(AmbulanceDTO dto);
}
