package com.xworkz.college.repo;

import com.xworkz.college.dto.CollegeDTO;

public class CollegeRepositoryImpl implements CollegeRepository {
	private CollegeDTO[] college = new CollegeDTO[5];
	private int collegeIndex = 0;

	@Override
	public boolean save(CollegeDTO dto) {
		if (this.collegeIndex < this.college.length) {
			college[collegeIndex] = dto;
			System.out.println("Saving is correct");
			collegeIndex++;
			return true;
		} else {
			System.out.println("saving is incorrect");
		}
		return false;
	}

	@Override
	public CollegeDTO find(CollegeDTO dto) {
		for (int collegeIndex = 0; collegeIndex < this.college.length; collegeIndex++) {
			CollegeDTO ref = this.college[collegeIndex];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}
		}
		return null;
	}

	@Override
	public CollegeDTO findByName(String name) {
		for (int collegeIndex = 0; collegeIndex < this.college.length; collegeIndex++) {
			CollegeDTO ref = this.college[collegeIndex];
			if (ref.getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref;
			}
		}
		return null;
	}

	@Override
	public CollegeDTO findById(int id) {
		for (int collegeIndex = 0; collegeIndex < this.college.length; collegeIndex++) {
			CollegeDTO ref = this.college[collegeIndex];
			if (ref.getId() == id) {
				System.out.println("dto is found for id");
				return ref;
			}
		}
		return null;
	}

	@Override
	public CollegeDTO findByNameAndOwner(String name, String owner) {
		for (int collegeIndex = 0; collegeIndex < this.college.length; collegeIndex++) {
			CollegeDTO ref = this.college[collegeIndex];
			if (ref.getName().equals(name) && ref.getOwner().equals(owner)) {
				System.out.println("dto is found for name,owner");
				return ref;
			}
		}
		return null;
	}

	@Override
	public double findFeesByName(String name, int id) {
		for (int collegeIndex = 0; collegeIndex < this.college.length; collegeIndex++) {
			CollegeDTO ref = this.college[collegeIndex];
			if (ref.getName().equals(name)) {
				System.out.println("fees is found for name");
				return ref.getFees();
			}
		}
		return 0;
	}

	@Override
	public int findIdByNameAndOwner(String name, String owner) {
		for (int collegeIndex = 0; collegeIndex < this.college.length; collegeIndex++) {
			CollegeDTO ref = this.college[collegeIndex];
			if (ref.getName().equals(name) && ref.getOwner().equals(owner)) {
				System.out.println("Id is found for name,owner");
				return ref.getId();
			}
		}
		return 0;
	}

	@Override
	public int total() {

		return this.collegeIndex;
	}

}
