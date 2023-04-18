package com.xworkz.collections.repo;

import java.util.Optional;

import com.xworkz.collections.dto.SnakeDTO;

public interface SnakeRepository {
	
	boolean save(SnakeDTO dto);
	
	Optional<SnakeDTO> findById(int id);
	
	default Optional<SnakeDTO> findByName(String name){
		return Optional.empty();
	}
	
	default Optional<SnakeDTO> findByNameAndPlace(String name,String place){
		return Optional.empty();
	}

}
