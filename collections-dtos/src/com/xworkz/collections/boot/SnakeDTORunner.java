package com.xworkz.collections.boot;

import java.security.Provider.Service;
import java.util.Optional;

import com.xworkz.collections.consts.Type;
import com.xworkz.collections.dto.SnakeDTO;
import com.xworkz.collections.repo.SnakeRepository;
import com.xworkz.collections.repo.SnakeRepositoryImpl;
import com.xworkz.collections.service.SnakeService;
import com.xworkz.collections.service.SnakeServiceImpl;

public class SnakeDTORunner {

	public static void main(String[] args) {
		
		SnakeDTO snake1=new SnakeDTO(1, "Python", Type.VENOMOUS, "Mysore Zoo");
		//SnakeDTO snake2=new SnakeDTO(2, "", null, null)
		System.out.println(snake1);
		SnakeRepository repository=new SnakeRepositoryImpl();
		
		SnakeService service=new SnakeServiceImpl(repository);
		
		
		boolean save1=service.validateAndSave(snake1);
		System.out.println(save1);
		
		Optional<SnakeDTO> optionalById=service.findById(1);
		if(optionalById.isPresent()) {
			System.out.println("Snake exist");
			SnakeDTO optional=optionalById.get();
			System.out.println(optional);
		}
		else {
			System.out.println("Snake does not exist");
		}
	
		Optional<SnakeDTO> OptionalByName=service.findByName("Python");
		if(OptionalByName.isPresent()) {
			System.out.println("snake exist for name ");
			SnakeDTO optional=OptionalByName.get();
			System.out.println(optional);
		}
		
		Optional<SnakeDTO> OptionalByNameAndPlace=service.findByNameAndPlace("Python","Mysore Zoo");
		if(OptionalByNameAndPlace.isPresent()) {
			System.out.println("snake exist for name and place");
			SnakeDTO optional=OptionalByNameAndPlace.get();
			System.out.println(optional);
		}
	}
	
	
	

}
