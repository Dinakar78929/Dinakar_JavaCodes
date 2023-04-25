package com.xworkz.police.repo;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.police.dto.MarriageDTO;
import com.xworkz.police.dto.PoliceStationDTO;

public class MarriageRepositoryImpl implements MarriageRepository{
	private Collection<MarriageDTO> marriageDTOs=new ArrayList<MarriageDTO>();
	
	public MarriageRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean save(MarriageDTO dto) {
		
		return this.marriageDTOs.add(dto);
	}

}
