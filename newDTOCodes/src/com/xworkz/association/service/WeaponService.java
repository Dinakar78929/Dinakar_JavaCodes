package com.xworkz.association.service;

import com.xworkz.association.dto.WeaponDTO;

public interface WeaponService  {
	
	boolean validateAndThenSave(WeaponDTO dto);

}
