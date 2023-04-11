package com.xworkz.shoes.repo;

import com.xworkz.shoes.constants.Type;
import com.xworkz.shoes.dto.ShoeDTO;

public interface ShoeRepository {
	
	boolean save(ShoeDTO dto);

	ShoeDTO find(ShoeDTO dto);

	ShoeDTO findByBrand(String brand);

	double findPriceByBrandAndType(String brand, Type type);

	ShoeDTO[] findAll();

	ShoeDTO findByBrandOrPriceOrType(String brand, double price, Type type);

}
