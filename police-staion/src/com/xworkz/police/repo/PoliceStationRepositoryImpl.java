package com.xworkz.police.repo;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.police.dto.PoliceStationDTO;

public class PoliceStationRepositoryImpl implements PoliceStationRepository{
	private Collection<PoliceStationDTO> policeDTOs=new ArrayList<PoliceStationDTO>();
	
	public PoliceStationRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public PoliceStationRepositoryImpl(Collection<PoliceStationDTO> policeDTOs) {
		this.policeDTOs = policeDTOs;
	}



	@Override
	public boolean save(PoliceStationDTO dto) {
			return this.policeDTOs.add(dto);
		
	}

}
