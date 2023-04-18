package com.xworkz.collections.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.collections.consts.Type;
import com.xworkz.collections.dto.SnakeDTO;

public class SnakeRepositoryImpl implements SnakeRepository {

	private Collection<SnakeDTO> snakeDTOs = new ArrayList<SnakeDTO>();

	public SnakeRepositoryImpl() {
		System.out.println("No args constructor");
	}

	public SnakeRepositoryImpl(Collection<SnakeDTO> snakeDTOs) {
		this.snakeDTOs = snakeDTOs;
	}

	@Override
	public boolean save(SnakeDTO dto) {
		if (snakeDTOs != null) {
			return this.snakeDTOs.add(dto);
		}
		return false;

	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		for (SnakeDTO snakeDTO : snakeDTOs) {
			if (snakeDTO.getId() == id) {
				return Optional.of(snakeDTO);
			}
		}
		return Optional.empty();

	}

	public Optional<SnakeDTO> findByName(String name) {
		for (SnakeDTO snakeDTO : snakeDTOs) {
			if (snakeDTO.getName().equals(name)) {
				return Optional.of(snakeDTO);
			}
		}
		return Optional.empty();
	}

	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		for (SnakeDTO snakeDTO : snakeDTOs) {
			if (snakeDTO.getName().equals(name) && snakeDTO.getPlace().equals(place)) {
				return Optional.of(snakeDTO);
			}
		}
		return Optional.empty();

	}

}
