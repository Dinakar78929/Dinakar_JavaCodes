package com.xworkz.animal.repo;

import com.xworkz.animal.dto.AnimalDTO;

public class AnimalRepositoryImpl implements AnimalRepository{
	private AnimalDTO[] animal=new AnimalDTO[5];
	private int animalIndex=0;
	@Override
	public boolean save(AnimalDTO dto) {
		if(this.animalIndex<this.animal.length)
		{
			animal[animalIndex]=dto;
			System.out.println("saving is correct");
			animalIndex++;
			return true;
		}
		else
		{
			System.out.println("Saving is incorrect");
		}
		return false;
	}

	@Override
	public AnimalDTO find(AnimalDTO dto) {
		for(int animalIndex=0;animalIndex<this.animal.length;animalIndex++)
		{
			AnimalDTO ref=this.animal[animalIndex];	
			if(ref.equals(dto))
			{
				System.out.println("dto is found");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AnimalDTO findByName(String name) {
		for(int animalIndex=0; animalIndex<animal.length; animalIndex++)
		{
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.getName().equals(name))
			{
				System.out.println("dto is found for name");
				return ref;
			}
		}
		return null;
	}

	@Override
	public int findLifeSpanByName(String name) {
		for(int animalIndex=0; animalIndex<animal.length; animalIndex++)
		{
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.getName().equals(name))
			{
				System.out.println("LifeSpan is found for name");
				return ref.getLifeSpan();
			}
		}
		return 0;
	}

	@Override
	public String findNameByLifeSpanAndWeigthAndHeight(int lifeSpan, double weight, double height) {
		for(int animalIndex=0; animalIndex<animal.length; animalIndex++)
		{
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.getLifeSpan()==lifeSpan && ref.getWeight()==weight && ref.getHeight()==height)
			{
				System.out.println("Name is found for lifespan,weight,height");
				return ref.getName();			}
		}
		return null;
	}

	@Override
	public int total() {
		
		return this.animalIndex;
	}

}
