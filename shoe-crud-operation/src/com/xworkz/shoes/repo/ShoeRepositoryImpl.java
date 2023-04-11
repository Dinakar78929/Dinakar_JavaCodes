package com.xworkz.shoes.repo;

import com.xworkz.shoes.constants.Type;
import com.xworkz.shoes.dto.ShoeDTO;

public class ShoeRepositoryImpl implements ShoeRepository {
	private ShoeDTO[] shoes = new ShoeDTO[5];
	private int shoesIndex = 0;

	@Override
	public boolean save(ShoeDTO dto) {
		if (this.shoesIndex < this.shoes.length) {
			shoes[shoesIndex] = dto;
			System.out.println("saving is correct");
			this.shoesIndex++;
			return true;
		}
		else
		{
			System.out.println("saving is not correct ");
		}

		return false;
	}

	@Override
	public ShoeDTO find(ShoeDTO dto) {
		for (int shoesIndex = 0; shoesIndex < shoes.length; shoesIndex++) {
			ShoeDTO ref = this.shoes[shoesIndex];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}
		}
		return null;
	}

	@Override
	public ShoeDTO findByBrand(String brand) {
		for (int shoesIndex = 0; shoesIndex < shoes.length; shoesIndex++) {
			ShoeDTO ref = this.shoes[shoesIndex];
			if (ref.getBrand().equals(brand)) {
				System.out.println("dto is found for name");
				return ref;
			}
		}
		return null;
	}

	@Override
	public double findPriceByBrandAndType(String brand, Type type) {
		for (int shoesIndex = 0; shoesIndex < shoes.length; shoesIndex++) {
			ShoeDTO ref = this.shoes[shoesIndex];
			if (ref.getBrand().equals(brand)&& ref.getType().equals(type)) {
				System.out.println("price is found for brand and type");
				return ref.getPrice();
			}
		}
		return 0;
	}

	@Override
	public ShoeDTO[] findAll() {
		for (int shoesIndex = 0; this.shoesIndex < this.shoes.length; this.shoesIndex++) {
			ShoeDTO ref = this.shoes[shoesIndex];
			if(ref.equals(shoes)) {
				return this.shoes;
			}
		 
			}
		return null;
	
	}

	@Override
	public ShoeDTO findByBrandOrPriceOrType(String brand, double price, Type type) {
		for(int shoesIndex=0; shoesIndex<shoes.length; shoesIndex++)
		{
			ShoeDTO ref = this.shoes[shoesIndex];
			if (ref.getBrand().equals(brand)|| ref.getPrice()==price || ref.getType().equals(type)) {
				System.out.println("dto is found");
				return ref;
			}
	}
		
		
		return null;
	}

//	@Override
//	public ShoeDTO[] findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
