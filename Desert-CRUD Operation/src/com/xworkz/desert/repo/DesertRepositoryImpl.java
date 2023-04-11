package com.xworkz.desert.repo;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.exception.MemoryFullException;

public class DesertRepositoryImpl implements DesertRepository {
	private DesertDTO[] desert = new DesertDTO[23];
	private int desertIndex = 0;

	@Override
	public boolean save(DesertDTO dto) throws MemoryFullException {
		if (this.desertIndex < this.desert.length) {
			desert[desertIndex] = dto;
			System.out.println("Saving is correct");
			desertIndex++;
			return true;
		} else {
			System.out.println("Saving is not correct");
		}
		throw new MemoryFullException("memory is full");
	}

//	@Override
//	public boolean isExist(DesertDTO dto) {
//		if(desertIndex==0)
//		{
//			System.out.println("first element is not found");
//			return false;
//		}
//		else
//		{
//			System.out.println("first element is found");
//			for (int desertIndex = 0; desertIndex < this.desert.length; desertIndex++) {
//				DesertDTO ref = this.desert[desertIndex];
//				if (ref.equals(dto)) {
//					System.out.println("dto is exist");
//					return true;
//				} else {
//					System.out.println("dto is notexist");
//				}
//			
//		}
//		}
//		return false;
//	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		for (int desertIndex = 0; desertIndex < this.desert.length; desertIndex++) {
			DesertDTO ref = this.desert[desertIndex];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}
		}
		
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		for (int desertIndex = 0; desertIndex < this.desert.length; desertIndex++) {
			DesertDTO ref = this.desert[desertIndex];
			if (ref.getName().equals(name)) {
				System.out.println("dto is found for Name");
				return ref;
			} 
		}
		return null;
	}

	@Override
	public double findAreaByName(String name) {
		for (int desertIndex = 0; desertIndex < this.desert.length; desertIndex++) {
			DesertDTO ref = this.desert[desertIndex];
			if (ref.getName().equals(name)) {
				System.out.println("area is found for Name");
				return ref.getArea();
			} 
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		for (int desertIndex = 0; desertIndex < this.desert.length; desertIndex++) {
			DesertDTO ref = this.desert[desertIndex];
			if (ref.getName().equals(name)&& ref.getCountry().equals(country)&& ref.getArea()==area ) {
				System.out.println("dto is found for Name");
				return ref;
			} 
		}
		return null;
	}

	@Override
	public int total() {
		
		return this.desertIndex;
	}

}
