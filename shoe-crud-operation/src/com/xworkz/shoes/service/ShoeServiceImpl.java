package com.xworkz.shoes.service;
import static com.xworkz.shoes.util.ValidateUtil.*;
import com.xworkz.shoes.constants.Type;
import com.xworkz.shoes.dto.ShoeDTO;
import com.xworkz.shoes.repo.ShoeRepository;

public class ShoeServiceImpl implements ShoeService {
	
	private ShoeRepository repo;
	
	public ShoeServiceImpl(ShoeRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ShoeDTO dto) {
		System.out.println("-----Running validateAndSave Method-----");
		if (dto != null) {
			System.out.println("dto is not null,we can validate");

			String brand=dto.getBrand();
			Type type=dto.getType();
			double price=dto.getPrice();
			int size=dto.getSize();
			int warranty=dto.getWarranty();
			
			boolean validBrand=false;
			boolean validType=false;
			boolean validPrice=false;
			boolean validSize=false;
			boolean validWarranty=false;
			
			if(validString(brand))
			{
				System.out.println("valid Brand");
				validBrand=true;
			}
			else
			{
				System.err.println("Invalid Brand");
			}
			
			if(validType(type))
			{
				System.out.println("valid Type");
				validType=true;
			}
			else
			{
				System.err.println("Invalid Type");
			}
			
			if(validDouble(price))
			{
				System.out.println("valid Price");
				validPrice=true;
			}
			else
			{
				System.err.println("Invalid Price");
			}
			
			if(validInt(size))
			{
				System.out.println("valid size");
				validSize=true;
			}
			else
			{
				System.err.println("Invalid size");
			}
			
			if(validInt(warranty))
			{
				System.out.println("valid Warranty");
				validWarranty=true;
			}
			else
			{
				System.err.println("Invalid Warranty");
			}
			
			
			if(validFlag(validBrand,validType,validPrice,validSize,validWarranty))
			{
				System.out.println("dto is found we can save the data");
				this.repo.save(dto);
				return true;
			
			}
			else
			{
				System.err.println("dto is notfound we cannot save the data");
			}
			

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public ShoeDTO find(ShoeDTO dto) {
		if(dto!=null)
		{
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public ShoeDTO findByBrand(String brand) {
		if(validString(brand))
		{
			return this.repo.findByBrand(brand);
		}
		return null;
	}

	@Override
	public double findPriceByBrandAndType(String brand, Type type) {
		if(validString(brand)&& validType(type))
		{
			return this.repo.findPriceByBrandAndType(brand, type);
		}
		return 0;
	}

	@Override
	public ShoeDTO[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoeDTO findByBrandOrPriceOrType(String brand, double price, Type type) {
		if(validString(brand)&& validDouble(price) && validType(type))
		{
			return this.repo.findByBrandOrPriceOrType(brand, price, type);
		}
		return null;
	}

}
