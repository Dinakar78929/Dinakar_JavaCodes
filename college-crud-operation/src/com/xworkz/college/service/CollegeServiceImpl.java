package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.college.repo.CollegeRepository;

import static com.xworkz.college.util.ValidationUtil.*;

public class CollegeServiceImpl implements CollegeService {

	private CollegeRepository repo;

	public CollegeServiceImpl(CollegeRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(CollegeDTO dto) {
		System.out.println("Running Validate and save method");
		if (dto != null) {
			System.out.println("dto is not null,we can validate");

			int id = dto.getId();
			String name = dto.getName();
			String owner = dto.getOwner();
			String location = dto.getLocation();
			double fees = dto.getFees();

			boolean validId = false;
			boolean validName = false;
			boolean validOwner = false;
			boolean validLocation = false;
			boolean validFees = false;

			if (validInt(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.out.println("invalid id");
			}

			if (validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.out.println("invalid name");
			}

			if (validString(owner)) {
				System.out.println("valid owner");
				validOwner = true;
			} else {
				System.out.println("invalid owner");
			}
			if (validString(location)) {
				System.out.println("valid location");
				validLocation = true;
			} else {
				System.out.println("invalid location");
			}
			if (validDouble(fees)) {
				System.out.println("valid fees");
				validFees = true;
			} else {
				System.out.println("invalid fees");
			}

			if (validFlag(validId, validName, validOwner, validLocation, validFees)) {
				System.out.println("dto is valid we can save the data");
				this.repo.save(dto);
				return true;
			} else {
				System.out.println("dto is invalid,we cannot save the data");
			}

		} else {
			System.out.println("dto is null");
		}
		return false;
	}

	@Override
	public CollegeDTO find(CollegeDTO dto) {
		if (dto != null) {
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public CollegeDTO findByName(String name) {
		if (validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public CollegeDTO findById(int id) {
		if (validInt(id)) {
			return this.repo.findById(id);
		}
		return null;
	}

	@Override
	public CollegeDTO findByNameAndOwner(String name, String owner) {
		if (validString(name) && validString(owner)) {
			return this.repo.findByNameAndOwner(name, owner);
		}
		return null;
	}

	@Override
	public double findFeesByName(String name, int id) {
		if (validString(name) && validInt(id)) {
			return this.repo.findFeesByName(name, id);
		}
		return 0;
	}

	@Override
	public int findIdByNameAndOwner(String name, String owner) {
		if (validString(name) && validString(owner)) {
			return this.repo.findIdByNameAndOwner(name, owner);
		}
		return 0;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

}
