package com.xworkz.collections.service;

import java.util.Optional;

import com.xworkz.collections.dto.SnakeDTO;
import com.xworkz.collections.repo.SnakeRepository;

public class SnakeServiceImpl implements SnakeService{
	
	private SnakeRepository repo;
	
	

	public SnakeServiceImpl(SnakeRepository repo) {
		
		this.repo = repo;
	}



	@Override
	public boolean validateAndSave(SnakeDTO dto) {
		if(dto!=null) {
		return this.repo.save(dto);
		}
		return false;
	}



	@Override
	public Optional<SnakeDTO> findById(int id) {
		
		return this.repo.findById(id);
	}
	
	public Optional<SnakeDTO> findByName(String name){
		return this.repo.findByName(name);
	}
	
	public Optional<SnakeDTO> findByNameAndPlace(String name,String place){
		return this.repo.findByNameAndPlace(name, place);
	}

}
