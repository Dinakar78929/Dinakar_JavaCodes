package com.xworkz.desert.boot;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.exception.DataInvalidException;
import com.xworkz.desert.repo.DesertRepository;
import com.xworkz.desert.repo.DesertRepositoryImpl;
import com.xworkz.desert.service.DesertService;
import com.xworkz.desert.service.DesertServiceImpl;

public class DesertDTORunner {
	
	public static void main(String[] args)
	{
		DesertDTO desertDTO1=new DesertDTO(1, "Antartic Desert", "America", 14200, -89.2, -10);
		DesertDTO desertDTO2=new DesertDTO(2, "Artic Desert", "Europe", 13900, 10, 5);
		DesertDTO desertDTO3=new DesertDTO(3, "Sahara Desert", "Africa", 9200, 11, 6);
		DesertDTO desertDTO4=new DesertDTO(4, "Arabian Desert", "Western Asia", 2330, 12, 7);
		DesertDTO desertDTO5=new DesertDTO(5, "Gobi Desert", "Eastern Asia", 1290, 0, 0);
		DesertDTO desertDTO6=new DesertDTO(6, "Kalahari Desert", "Southern Africa",900, 0, 0);
		DesertDTO desertDTO7=new DesertDTO(7, "Patagonian Desert", "South America", 673, 0, 0);
		DesertDTO desertDTO8=new DesertDTO(8, "Syrian Desert","Western Asia",500, 0, 0);
		DesertDTO desertDTO9=new DesertDTO(9, "Chihuahuan Desert","Northern America", 453, 0, 0);
		DesertDTO desertDTO10=new DesertDTO(10, "Karakum Desert", "Central Asia",350, 0, 0);
		DesertDTO desertDTO11=new DesertDTO(11, "Sonoram Desert", "Central America", 310, 0, 0);
		DesertDTO desertDTO12=new DesertDTO(12, "Kyzylkum Desert", "Central Asia", 300, 0, 0);
		DesertDTO desertDTO13=new DesertDTO(13, "Taklamakan Desert", "Eastern Asia",270, 0, 0);
		DesertDTO desertDTO14=new DesertDTO(14, "Ogden Desert", "Eastern Africa", 256, 0, 0);
		DesertDTO desertDTO15=new DesertDTO(15, "Thar Desert", "India",238, 0, 0);
		DesertDTO desertDTO16=new DesertDTO(16, "Puntland Desert", "Eastern Africa", 200, 0, 0);
		DesertDTO desertDTO17=new DesertDTO(17, "Guban Desert", "Eastern Africa",175, 0, 0);
		DesertDTO desertDTO18=new DesertDTO(18, "Namib Desert", "Middle Africa",160, 0, 0);
		DesertDTO desertDTO19=new DesertDTO(19, "Ragistan Desert", "Southern Asia", 146, 0, 0);
		DesertDTO desertDTO20=new DesertDTO(20, "Atacama Desert", "Chile",140, 0, 0);
		DesertDTO desertDTO21=new DesertDTO(21, "Dankil Desert", "Djibouti", 137, 0, 0);
		DesertDTO desertDTO22=new DesertDTO(22, "MojaveDesert", "US America", 124, 0, 0);
		DesertDTO desertDTO23=new DesertDTO(23, "Chilbi Desert", "kenya",100, 0, 0);
		
		DesertRepository desertRepository=new DesertRepositoryImpl();
		
		DesertService service=new DesertServiceImpl(desertRepository);
		
		boolean save1;
		try {
			boolean save = service.validateAndSave(desertDTO1);
			System.out.println("1st dto is saved:" + save);
		
		boolean save2 = service.validateAndSave(desertDTO2);
		System.out.println("2nd dto is saved:" + save2);
		
		boolean save3 = service.validateAndSave(desertDTO3);
		System.out.println("3rd dto is saved:" + save3);
		
		boolean save4 = service.validateAndSave(desertDTO4);
		System.out.println("4st dto is saved:" + save4);
		
		boolean save5 = service.validateAndSave(desertDTO5);
		System.out.println("5st dto is saved:" + save5);
		
		boolean save6 = service.validateAndSave(desertDTO6);
		System.out.println("6st dto is saved:" + save6);
		
		boolean save7 = service.validateAndSave(desertDTO7);
		System.out.println("7st dto is saved:" + save7);
		
		boolean save8 = service.validateAndSave(desertDTO8);
		System.out.println("8st dto is saved:" + save8);
		
		boolean save9 = service.validateAndSave(desertDTO9);
		System.out.println("9st dto is saved:" + save9);
		
		boolean save10 = service.validateAndSave(desertDTO10);
		System.out.println("10st dto is saved:" + save10);
		
		boolean save11 = service.validateAndSave(desertDTO11);
		System.out.println("11st dto is saved:" + save11);
		
		
		boolean save12 = service.validateAndSave(desertDTO12);
		System.out.println("12st dto is saved:" + save12);
		
		boolean save13 = service.validateAndSave(desertDTO13);
		System.out.println("13st dto is saved:" + save13);
		
		boolean save14 = service.validateAndSave(desertDTO14);
		System.out.println("14st dto is saved:" + save14);
		
		boolean save15 = service.validateAndSave(desertDTO15);
		System.out.println("15st dto is saved:" + save15);
		
		boolean save16 = service.validateAndSave(desertDTO16);
		System.out.println("16st dto is saved:" + save16);
		
		boolean save17 = service.validateAndSave(desertDTO17);
		System.out.println("17st dto is saved:" + save17);
		
		boolean save18 = service.validateAndSave(desertDTO18);
		System.out.println("18st dto is saved:" + save18);
		
		boolean save19 = service.validateAndSave(desertDTO19);
		System.out.println("19st dto is saved:" + save19);
		
		boolean save20 = service.validateAndSave(desertDTO20);
		System.out.println("20st dto is saved:" + save20);	
		
		System.out.println("-------------------");
		System.out.println("total saved:"+service.total());
		
		System.out.println("-----------running find method---------");
		
		DesertDTO find1=service.find(desertDTO1);
		System.out.println(find1);
		
		DesertDTO find2=service.find(desertDTO2);
		System.out.println(find2);
		
		DesertDTO find3=service.find(desertDTO3);
		System.out.println(find3);
		
		DesertDTO find4=service.find(desertDTO4);
		System.out.println(find4);
		
		DesertDTO find5=service.find(desertDTO5);
		System.out.println(find5);
		
		DesertDTO find6=service.find(desertDTO6);
		System.out.println(find6);
		
		DesertDTO find7=service.find(desertDTO7);
		System.out.println(find7);
		
		DesertDTO find8=service.find(desertDTO8);
		System.out.println(find8);
		
		DesertDTO find9=service.find(desertDTO9);
		System.out.println(find9);
		
		DesertDTO find10=service.find(desertDTO10);
		System.out.println(find10);
		
		DesertDTO find11=service.find(desertDTO11);
		System.out.println(find11);
		
		DesertDTO find12=service.find(desertDTO12);
		System.out.println(find12);
		
		DesertDTO find13=service.find(desertDTO13);
		System.out.println(find13);
		
		DesertDTO find14=service.find(desertDTO14);
		System.out.println(find14);
		
		DesertDTO find15=service.find(desertDTO15);
		System.out.println(find15);
		
		DesertDTO find16=service.find(desertDTO16);
		System.out.println(find16);
		
		DesertDTO find17=service.find(desertDTO17);
		System.out.println(find17);
		
		DesertDTO find18=service.find(desertDTO18);
		System.out.println(find18);
		
		DesertDTO find19=service.find(desertDTO19);
		System.out.println(find19);
		
		DesertDTO find20=service.find(desertDTO20);
		System.out.println(find20);
//		
//		DesertDTO find21=service.find(desertDTO21);
//		System.out.println(find21);
//		
//		DesertDTO find22=service.find(desertDTO22);
//		System.out.println(find22);
//		
//		DesertDTO find23=service.find(desertDTO23);
//		System.out.println(find23);
		
		System.out.println("-----------end find method-------------");
		
		System.out.println("-------running find areabyname method-------");
		
		double area=service.findAreaByName("Antartic Desert");
		System.out.println(area);
		
		System.out.println("-------end find areabyname method-------");
		
		DesertDTO dto1=service.findByName("Sahara Desert");
		System.out.println(dto1);
		
//		double area2=service.findAreaByName("Sahara Desert");
//		System.out.println(area2);
		
		}catch (DataInvalidException e) {
			System.out.println(e.getMessage());
		}
	}

}
