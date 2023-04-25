package com.xworkz.police.service;

import com.xworkz.police.dto.MarriageDTO;

public interface MarriageService {
	boolean validateAndSave(MarriageDTO dto);
}
