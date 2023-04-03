package com.xworkz.headphone.service;

import com.xworkz.headphone.dto.SoftwareDTO;

public class SoftwareServiceImpl implements SoftwareService{

	@Override
	public boolean validateAndThenSave(SoftwareDTO dto) {
		System.out.println("Running validateAndThenSave Method");
		if(dto!=null) {
			System.out.println("dto is not null");
			int id=dto.getId();
			String name=dto.getName();
			int version=dto.getVersion();
			String developedBy=dto.getDevelopedBy();
			
			boolean valid
		}
		return false;
	}
	
}
