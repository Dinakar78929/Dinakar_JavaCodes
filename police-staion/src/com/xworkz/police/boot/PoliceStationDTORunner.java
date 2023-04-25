package com.xworkz.police.boot;

import java.util.Collection;

import com.xworkz.police.consts.Cell;
import com.xworkz.police.dto.PoliceStationDTO;
import com.xworkz.police.repo.PoliceStationRepository;
import com.xworkz.police.repo.PoliceStationRepositoryImpl;
import com.xworkz.police.service.PoliceStationService;
import com.xworkz.police.service.PoliceStationServiceImpl;

public class PoliceStationDTORunner {

	public static void main(String[] args) {
		
		PoliceStationRepository repository=new PoliceStationRepositoryImpl();
		
		PoliceStationService service=new PoliceStationServiceImpl(repository);
		
		PoliceStationDTO dto1= new PoliceStationDTO(1,"CentralPolice","TagaruShiva",Cell.TWO,"Rajajinagar");
		PoliceStationDTO dto2= new PoliceStationDTO(2,"MiddlePolice","JHon",Cell.ONE,"Shivaginagar");
		
		boolean save1=service.validateAndSave(dto1);
		System.out.println("dto is saved:"+save1);
		
		boolean save2=service.validateAndSave(dto2);
		System.out.println("dto is saved:"+save2);
	}
}
