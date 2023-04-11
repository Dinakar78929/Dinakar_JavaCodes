package com.xworkz.animal.service;

//import static com.xworkz.desert.util.DesertUtil.validString;

//import java.awt.Window.Type;

import com.xworkz.animal.dto.AnimalDTO;
import com.xworkz.animal.repo.AnimalRepository;

import static com.xworkz.animal.util.AnimalUtil.*;

public class AnimalServiceImpl implements AnimalService {

	private AnimalRepository repo;

	public AnimalServiceImpl(AnimalRepository repo) {
		this.repo=repo;
	}

	@Override
	public boolean validateAndSave(AnimalDTO dto) {
		System.out.println("Running validateAndSave method");
		if (dto != null) {
			System.out.println("dto is not null,we can validate");

			String name = dto.getName();
//			Type type=dto.getType();
			int lifeSpan = dto.getLifeSpan();
			double weight = dto.getWeight();
			double height = dto.getHeight();

			boolean validName = false;
			boolean validLifeSpan = false;
			boolean validWeight = false;
			boolean validHeight = false;

			if (validString(name)) {
				System.out.println("Valid Name");
				validName = true;
			} else {
				System.out.println("InValid Name");
			}

			if (validInt(lifeSpan)) {
				System.out.println("Valid lifeSpan");
				validLifeSpan = true;
			} else {
				System.out.println("InValid lifeSpan");
			}

			if (validDouble(weight)) {
				System.out.println("Valid weight");
				validWeight = true;
			} else {
				System.out.println("InValid weight");
			}

			if (validDouble(height)) {
				System.out.println("Valid height");
				validHeight = true;
			} else {
				System.out.println("InValid height");
			}

			if (validFlag(validName, validLifeSpan, validWeight, validHeight)) {
				System.out.println("dto is valid we can save the data");
				this.repo.save(dto);
				return true;
			} else {
				System.out.println("dto is not valid we cannot save the data");
			}

		} else {
			System.out.println("dto is null");
		}
		return false;
	}

	@Override
	public AnimalDTO find(AnimalDTO dto) {
		if (dto != null) {
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public AnimalDTO findByName(String name) {
		if (validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public int findLifeSpanByName(String name) {
		if (validString(name)) {
			return this.repo.findLifeSpanByName(name);
		}
		return 0;
	}

	@Override
	public String findNameByLifeSpanAndWeigthAndHeight(int lifeSpan, double weight, double height) {
		if (validInt(lifeSpan) && validDouble(weight) && validDouble(height)) {
			return this.repo.findNameByLifeSpanAndWeigthAndHeight(lifeSpan, weight, height);
		}
		return null;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

}
