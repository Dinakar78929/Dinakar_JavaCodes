package com.xworkz.shoes.service;

import java.util.Collection;

import com.xworkz.shoes.dto.PersonDTO;

public interface PersonService {
	
	boolean saveAndThenValidate(PersonDTO dto);
	Collection<PersonDTO>  findByName(String name);
	Collection<PersonDTO> findByByear(int bYear);
	Collection<PersonDTO> findByFatherAndMother(String father,String mother);

}
