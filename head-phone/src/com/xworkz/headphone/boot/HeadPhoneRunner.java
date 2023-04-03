package com.xworkz.headphone.boot;

import java.time.LocalDate;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.TypeAndWeight;
import com.xworkz.headphone.dto.HeadPhoneDTO;
import com.xworkz.headphone.repo.HeadPhoneRepository;
import com.xworkz.headphone.repo.HeadPhoneRepositoryImpl;
import com.xworkz.headphone.service.HeadPhoneService;
import com.xworkz.headphone.service.HeadPhoneServiceImpl;

public class HeadPhoneRunner {

	public static void main(String[] args) {
		HeadPhoneDTO headPhone=new HeadPhoneDTO(Brand.MI, "JBL45", 1500, true, Color.BLACK, TypeAndWeight.NECK_BAND, "Dinakar", 25, LocalDate.of(2002,1,1),3);
				
		System.out.println(headPhone);
		
		HeadPhoneRepository headPhoneRepo=new HeadPhoneRepositoryImpl();
		
		
		HeadPhoneService headPhoneService=new HeadPhoneServiceImpl(headPhoneRepo);
		boolean saved=headPhoneService.validateAndThenSave(headPhone);
		System.out.println("saved:"+saved);
		
//		System.out.println("--------------------------------------------------");
//		
//		HeadPhoneDTO headPhone=new HeadPhoneDTO(Brand.MI, "JBL45", 1500, true, Color.BLACK, TypeAndWeight.NECK_BAND, "Dinakar", 25, LocalDate.of(2002,1,1),3);
//		
//		System.out.println(headPhone);
//		
//		HeadPhoneRepository headPhoneRepo=new HeadPhoneRepositoryImpl();
//		
//		
//		HeadPhoneService headPhoneService=new HeadPhoneServiceImpl(headPhoneRepo);
//		boolean saved=headPhoneService.validateAndThenSave(headPhone);
//		System.out.println("saved:"+saved);
//		
//		System.out.println("--------------------------------------------------");
//		
//		HeadPhoneDTO headPhone=new HeadPhoneDTO(Brand.MI, "JBL45", 1500, true, Color.BLACK, TypeAndWeight.NECK_BAND, "Dinakar", 25, LocalDate.of(2002,1,1),3);
//		
//		System.out.println(headPhone);
//		
//		HeadPhoneRepository headPhoneRepo=new HeadPhoneRepositoryImpl();
//		
//		
//		HeadPhoneService headPhoneService=new HeadPhoneServiceImpl(headPhoneRepo);
//		boolean saved=headPhoneService.validateAndThenSave(headPhone);
//		System.out.println("saved:"+saved);
//		
//		System.out.println("--------------------------------------------------");
//		HeadPhoneDTO headPhone=new HeadPhoneDTO(Brand.MI, "JBL45", 1500, true, Color.BLACK, TypeAndWeight.NECK_BAND, "Dinakar", 25, LocalDate.of(2002,1,1),3);
//		
//		System.out.println(headPhone);
//		
//		HeadPhoneRepository headPhoneRepo=new HeadPhoneRepositoryImpl();
//		
//		
//		HeadPhoneService headPhoneService=new HeadPhoneServiceImpl(headPhoneRepo);
//		boolean saved=headPhoneService.validateAndThenSave(headPhone);
//		System.out.println("saved:"+saved);
//		
//		System.out.println("--------------------------------------------------");
//		HeadPhoneDTO headPhone=new HeadPhoneDTO(Brand.MI, "JBL45", 1500, true, Color.BLACK, TypeAndWeight.NECK_BAND, "Dinakar", 25, LocalDate.of(2002,1,1),3);
//		
//		System.out.println(headPhone);
//		
//		HeadPhoneRepository headPhoneRepo=new HeadPhoneRepositoryImpl();
//		
//		
//		HeadPhoneService headPhoneService=new HeadPhoneServiceImpl(headPhoneRepo);
//		boolean saved=headPhoneService.validateAndThenSave(headPhone);
//		System.out.println("saved:"+saved);
//		
//		System.out.println("--------------------------------------------------");
//		
//		HeadPhoneDTO headPhone=new HeadPhoneDTO(Brand.MI, "JBL45", 1500, true, Color.BLACK, TypeAndWeight.NECK_BAND, "Dinakar", 25, LocalDate.of(2002,1,1),3);
//		
//		System.out.println(headPhone);
//		
//		HeadPhoneRepository headPhoneRepo=new HeadPhoneRepositoryImpl();
//		
//		
//		HeadPhoneService headPhoneService=new HeadPhoneServiceImpl(headPhoneRepo);
//		boolean saved=headPhoneService.validateAndThenSave(headPhone);
//		System.out.println("saved:"+saved);
		
		
		
		
		
		

	}

}
