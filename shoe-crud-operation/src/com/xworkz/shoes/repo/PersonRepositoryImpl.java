package com.xworkz.shoes.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.shoes.dto.PersonDTO;

public class PersonRepositoryImpl implements PersonRepository{
	
	private Collection<PersonDTO> persons=new ArrayList<PersonDTO>();
	
	public PersonRepositoryImpl() {
		System.out.println("No args constructor");
	}
	

	public PersonRepositoryImpl(Collection<PersonDTO> persons) {
		this.persons = persons;
	}



	@Override
	public boolean save(PersonDTO dto) {
		if(persons!=null) {
			return this.persons.add(dto);
		}
		return false;
				
	}

	@Override
	public Collection<PersonDTO> findByName(String name) {
				return this.persons.stream().filter(e->e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
			
	
	}

	@Override
	public Collection<PersonDTO> findByByear(int bYear) {
				return this.persons.stream().filter(e->e.getbYear()==bYear).collect(Collectors.toList());
			
	}

	@Override
	public Collection<PersonDTO> findByFatherAndMother(String father, String mother) {
		
				
				return this.persons.stream().filter(e->e.getFather().equalsIgnoreCase(father) && e.getMother().equalsIgnoreCase(mother)).collect(Collectors.toList());
			
	}

}
