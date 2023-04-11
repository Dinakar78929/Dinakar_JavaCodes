package com.xworkz.shoes.boot;

import com.xworkz.shoes.constants.Type;
import com.xworkz.shoes.dto.ShoeDTO;
import com.xworkz.shoes.repo.ShoeRepository;
import com.xworkz.shoes.repo.ShoeRepositoryImpl;
import com.xworkz.shoes.service.ShoeService;
import com.xworkz.shoes.service.ShoeServiceImpl;

public class ShoeDTORunner {

	public static void main(String[] args) {
		ShoeDTO shoeDTO1=new ShoeDTO("Sparkx", Type.SNEAKERS, 500,10, 2);
		
		ShoeRepository shoeRepository=new ShoeRepositoryImpl();
		
		ShoeService service=new ShoeServiceImpl(shoeRepository);
		
		boolean save1=service.validateAndSave(shoeDTO1);
		System.out.println("1st dto saved:"+save1);
		
		ShoeDTO find1=service.find(shoeDTO1);
		System.out.println("1st dto found:"+find1);
		
		ShoeDTO[] arrayDTO1=service.findAll();
		System.out.println(arrayDTO1);
		
		double price1=service.findPriceByBrandAndType("Sparkx", Type.SNEAKERS);
		System.out.println(price1);
		
//		System.out.println(service.findAll());	
		
		ShoeDTO dto1=service.findByBrandOrPriceOrType("Sparkx", 500, Type.SNEAKERS);
		System.out.println(dto1);
		
		
		

	}

}
