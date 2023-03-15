package com.xworkz.association.dto;

import com.xworkz.asssociation.service.ApplicationService;
import java.time.LocalDate;

public class ApplicationServiceDTOImpl implements ApplicationService{

	@Override
	public boolean validAndThenSave(ApplicationDTO dto) {
		if(dto!=null)
		{
			System.out.println("dto is not null, we can validate the properties");
			String name=dto.getName();
			double size=dto.getSize();
			double version=dto.getVersion();
			String developedBy=dto.getDevelopedBy();
			LocalDate date=dto.getCreatedDate();
			
			boolean validName=false;
			boolean validSize=false;
			boolean validVersion=false;
			boolean validDate=false;
			
			if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<30 )
			{
				System.out.println("name is valid");
				validName=true;
			}
			else
			{
				System.err.println("name is invalid");
			}
			
			if(size>0 && size <5)
			{
				System.out.println("size is valid");
				validSize=true;
			}
			else
			{
				System.err.println("size is invalid");
			}
			if(version>0 && version <100)
			{
				System.out.println("version is valid");
				validVersion=true;
			}
			else
			{
				System.err.println("version is invalid");
			}
			
			LocalDate tomorrow=LocalDate.now().plusDays(1);
			LocalDate startDate=LocalDate.of(2005, 1, 1);
			
			if(date !=null && date.isBefore(tomorrow) && date.isAfter(startDate))
			{
				System.out.println("date is valid");
				validDate=true;
			}
			else
			{
				System.err.println("date is invalid");
			}
		}
		else
		{
			System.err.println("dto is  null, we cannot validate the properties");
		}
		return false;
	}

}
