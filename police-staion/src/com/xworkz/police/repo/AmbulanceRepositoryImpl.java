package com.xworkz.police.repo;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.police.dto.AmbulanceDTO;
import com.xworkz.police.dto.MarriageDTO;

public class AmbulanceRepositoryImpl implements AmbulanceRepository{
	private Collection<AmbulanceDTO> ambulanceDTOs=new ArrayList<AmbulanceDTO>();
	@Override
	public boolean save(AmbulanceDTO dto) {
	
		return this.ambulanceDTOs.add(dto);
	}

}
