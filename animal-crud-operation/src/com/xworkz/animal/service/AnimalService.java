package com.xworkz.animal.service;

import com.xworkz.animal.dto.AnimalDTO;

public interface AnimalService {
	
	boolean validateAndSave(AnimalDTO dto);
	
	AnimalDTO find(AnimalDTO dto);
	
	AnimalDTO findByName(String name);
	
	int findLifeSpanByName(String name);
	
	String findNameByLifeSpanAndWeigthAndHeight(int lifeSpan,double weight,double height);
	
	int total();

}
