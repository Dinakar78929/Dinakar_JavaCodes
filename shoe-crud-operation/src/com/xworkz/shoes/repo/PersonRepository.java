package com.xworkz.shoes.repo;

import java.util.Collection;

import com.xworkz.shoes.dto.PersonDTO;

public interface PersonRepository {
	
	boolean save(PersonDTO dto);
	Collection<PersonDTO> findByName(String name);
	Collection<PersonDTO> findByByear(int bYear);
	Collection<PersonDTO> findByFatherAndMother(String father,String mother);
	
}
