package com.xworkz.animal.boot;

import com.xworkz.animal.dto.AnimalDTO;
import com.xworkz.animal.repo.AnimalRepository;
import com.xworkz.animal.repo.AnimalRepositoryImpl;
import com.xworkz.animal.service.AnimalService;
import com.xworkz.animal.service.AnimalServiceImpl;

public class AnimalDTORunner {
	
	public static void main(String[] args) {
		
		AnimalDTO animalDTO1=new AnimalDTO("Cheetha", 20, 100, 4);
		AnimalDTO animalDTO2=new AnimalDTO("Tiger", 21, 110, 4.5);
		AnimalDTO animalDTO3=new AnimalDTO("Camel", 50, 200, 8);
		AnimalDTO animalDTO4=new AnimalDTO("Dog", 10, 20, 2);
		AnimalDTO animalDTO5=new AnimalDTO("Cow1", 15, 300, 5);
		
		
		AnimalRepository repo=new AnimalRepositoryImpl();
		
		AnimalService service=new AnimalServiceImpl(repo);
		
		boolean save1=service.validateAndSave(animalDTO1);
		System.out.println("saved:"+save1);
		
		boolean save2=service.validateAndSave(animalDTO2);
		System.out.println("saved:"+save2);
		
		boolean save3=service.validateAndSave(animalDTO3);
		System.out.println("saved:"+save3);
		
		boolean save4=service.validateAndSave(animalDTO4);
		System.out.println("saved:"+save4);
		
		boolean save5=service.validateAndSave(animalDTO5);
		System.out.println("saved:"+save5);
		
		int sr=service.total();
		System.out.println("total saved:"+sr);
//		System.out.println(service.total());
		
		AnimalDTO dto=service.find(animalDTO1);
		System.out.println("animalDTO1:"+dto);
		
		String lifeSpan=service.findNameByLifeSpanAndWeigthAndHeight(15,300 , 5);
		System.out.println("Name is:"+lifeSpan);
		
		
	}

}
