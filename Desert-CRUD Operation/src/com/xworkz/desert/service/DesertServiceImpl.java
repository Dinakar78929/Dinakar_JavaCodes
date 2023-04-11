package com.xworkz.desert.service;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.exception.DataInvalidException;
import com.xworkz.desert.exception.MemoryFullException;
import com.xworkz.desert.repo.DesertRepository;

import static com.xworkz.desert.util.DesertUtil.*;

public class DesertServiceImpl implements DesertService {

	private DesertRepository repo;

	public DesertServiceImpl(DesertRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(DesertDTO dto) throws DataInvalidException {
		System.out.println("Running validateAndSave Method");
		if (dto != null) {
			System.out.println("DTO is not null,we can validate the data");

			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			double area = dto.getArea();
			double minTemp = dto.getMinTemp();
			double maxTemp = dto.getMaxTemp();

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validArea = false;
			boolean validMinTemp = false;
			boolean validMaxTemp = false;

			if (validInt(id)) {
				System.out.println("Valid Id");
				validId = true;
			} else {
				System.out.println("InValid Id");
			}

			if (validString(name)) {
				System.out.println("Valid Name");
				validName = true;
			} else {
				System.out.println("InValid Name");
			}

			if (validString(country)) {
				System.out.println("Valid country");
				validCountry = true;
			} else {
				System.out.println("InValid country");
			}

			if (validDouble(area)) {
				System.out.println("Valid area");
				validArea = true;
			} else {
				System.out.println("InValid area");
			}

			if (validDouble(minTemp)) {
				System.out.println("Valid minTemp");
				validMinTemp = true;
			} else {
				System.out.println("InValid minTemp");
			}

			if (validDouble(maxTemp)) {
				System.out.println("Valid maxTemp");
				validMaxTemp = true;
			} else {
				System.out.println("InValid maxTemp");
			}

			if (validFlag(validId, validName, validCountry, validArea, validMinTemp, validMaxTemp)) {
				System.out.println("dto are valid we can save the data");
				try {
					boolean save = this.repo.save(dto);
				} catch (MemoryFullException e) {
					System.out.println(e.getMessage());

				}
				return true;
			} else {
				System.err.println("dto are invalid we cannot save data");
			}

		} else {
			System.err.println("DTO is  null,we cannot validate the data");
		}
		throw new DataInvalidException("Enter correct data");
	}

	@Override
	public DesertDTO find(DesertDTO dto) throws DataInvalidException {
		if (dto != null) {
			return this.repo.find(dto);
		}
		throw new DataInvalidException("dto in invalid,enter valid dto");
	}

	@Override
	public DesertDTO findByName(String name) throws DataInvalidException {
		if (validString(name)) {
			return this.repo.findByName(name);
		}
		throw new DataInvalidException("name in invalid,enter valid name");
	}

	@Override
	public double findAreaByName(String name) throws DataInvalidException {
		if (validString(name)) {
			return this.repo.findAreaByName(name);
		}
		throw new DataInvalidException("name in invalid,enter valid name");
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) throws DataInvalidException {
		if (validString(name) && validString(country) && validDouble(area)) {
			return this.repo.findByNameAndCountryAndArea(name, country, area);
		}
		throw new DataInvalidException("name in invalid,enter valid name");
	}

	@Override
	public int total() {

		return this.repo.total();
	}

}
