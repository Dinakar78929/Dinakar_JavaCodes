package com.xworkz.animal.repo;

import com.xworkz.animal.dto.AnimalDTO;

public interface AnimalRepository {
	
	boolean save(AnimalDTO dto);

	AnimalDTO find(AnimalDTO dto);
	
	AnimalDTO findByName(String name);
	
	int findLifeSpanByName(String name);
	
	String findNameByLifeSpanAndWeigthAndHeight(int lifeSpan,double weight,double height);
	
	int total();
}
