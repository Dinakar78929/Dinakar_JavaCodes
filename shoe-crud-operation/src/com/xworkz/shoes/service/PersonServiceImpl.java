package com.xworkz.shoes.service;

import com.xworkz.shoes.dto.PersonDTO;
import com.xworkz.shoes.repo.PersonRepository;

import static com.xworkz.shoes.util.ValidateUtil.*;

import java.util.Collection;

public class PersonServiceImpl implements PersonService {
	private PersonRepository repo;

	public PersonServiceImpl(PersonRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndThenValidate(PersonDTO dto) {
		if (dto != null) {
			System.out.println("DTO is not null we can validate");

			String name = dto.getName();
			String place = dto.getPlace();
			String occupation = dto.getOccupation();
			int age = dto.getAge();
			int bYear = dto.getbYear();
			double weight = dto.getWeight();
			String motherToung = dto.getMotherToung();
			boolean married = dto.isMarried();
			String father = dto.getFather();
			String mother = dto.getMother();

			boolean validName = false;
			boolean validPlace = false;
			boolean validOccupation = false;
			boolean validAge = false;
			boolean validbYear = false;
			boolean validWeight = false;
			boolean validMotherToung = false;
			boolean validMarried = false;
			boolean validFather = false;
			boolean validMother = false;

			if (validString(name)) {
				System.out.println("Valid Name");
				validName = true;
			} else {
				System.err.println("InValid Name");
			}
			if (validString(place)) {
				System.out.println("Valid Place");
				validPlace = true;
			} else {
				System.err.println("InValid Place");
			}
			if (validString(occupation)) {
				System.out.println("Valid occupation");
				validOccupation = true;
			} else {
				System.err.println("InValid occupation");
			}

			if (validInt(age)) {
				System.out.println("Valid age");
				validAge = true;
			} else {
				System.err.println("InValid age");
			}

			if (validInt(bYear)) {
				System.out.println("Valid bYear");
				validbYear = true;
			} else {
				System.err.println("InValid bYear");
			}

			if (validDouble(weight)) {
				System.out.println("Valid weight");
				validWeight = true;
			} else {
				System.err.println("InValid weight");
			}
			if (validString(motherToung)) {
				System.out.println("Valid motherToung");
				validMotherToung = true;
			} else {
				System.err.println("InValid motherToung");
			}

			if (validBoolean(married)) {
				System.out.println("Valid married");
				validMarried = true;
			} else {
				System.err.println("InValid married");
			}

			if (validString(father)) {
				System.out.println("Valid father");
				validFather = true;
			} else {
				System.err.println("InValid father");
			}
			if (validString(mother)) {
				System.out.println("Valid mother");
				validMother = true;
			} else {
				System.err.println("InValid mother");
			}

			if (validFlag(validName, validPlace, validOccupation, validAge, validbYear, validWeight, validMotherToung,
					validMarried, validFather, validMother)) {
				System.out.println("DTO is found we can save the data");
				this.repo.save(dto);
				return true;
			} else {
				System.err.println("DTO is not found we cannot save the data");
			}
		} else {
			System.err.println("DTO is null");
		}
		return false;
	}

	@Override
	public Collection<PersonDTO> findByName(String name) {
		if(validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public Collection<PersonDTO> findByByear(int bYear) {
		if(validInt(bYear)) {
			return this.repo.findByByear(bYear);
		}
		return null;
	}

	@Override
	public Collection<PersonDTO> findByFatherAndMother(String father, String mother) {
		if(validString(father) && validString(mother)) {
			return this.repo.findByFatherAndMother(father, mother);
		}
		return null;
	}

}
