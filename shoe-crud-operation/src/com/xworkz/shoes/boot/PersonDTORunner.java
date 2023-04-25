package com.xworkz.shoes.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.xworkz.shoes.dto.PersonDTO;
import com.xworkz.shoes.repo.PersonRepository;
import com.xworkz.shoes.repo.PersonRepositoryImpl;
import com.xworkz.shoes.service.PersonService;
import com.xworkz.shoes.service.PersonServiceImpl;

public class PersonDTORunner {
	
	public static void main(String[] args) {
	PersonDTO person1= new PersonDTO("Jhon", "America", "Farmer", 45, 1990,70, "English", true, "Curran", "Mery");
	
	PersonRepository repository=new PersonRepositoryImpl();
	PersonService service= new PersonServiceImpl(repository);
	
	List<PersonDTO> lists= new ArrayList<>() ;
	lists.add(person1);
	
	boolean save1= service.saveAndThenValidate(person1);
	System.out.println(save1);
	
	Collection<PersonDTO> nm=service.findByName("jhon");
	System.out.println(nm);
	
	Collection<PersonDTO> nm1=service.findByFatherAndMother("curran", "Mery");
	System.out.println(nm1);
//	PersonDTO nm=service.findByFatherAndMother("Curran", "Mery");
//	System.out.println(nm);
	
	}
}
