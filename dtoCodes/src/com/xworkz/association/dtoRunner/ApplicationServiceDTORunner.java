package com.xworkz.association.dtoRunner;

import java.time.LocalDate;

import com.xworkz.association.dto.ApplicationDTO;
import com.xworkz.asssociation.service.ApplicationService;
import com.xworkz.association.dto.ApplicationServiceDTOImpl;

public class ApplicationServiceDTORunner {

	public static void main(String[] args) {
		ApplicationDTO application=new ApplicationDTO();
		application.setName("Facebook");
		application.setSize(2);
		application.setVersion(2.6);
		application.setDevelopedBy("Darshan");
		application.setCreatedDate(LocalDate.of(2010,6,1));
		
		
		System.out.println(application.equals((application)));
		System.out.println(application);
		
		ApplicationService applicationService=new ApplicationServiceDTOImpl();
		boolean saved=applicationService.validAndThenSave(application);
		System.out.println("saved:"+saved);

	}

}
