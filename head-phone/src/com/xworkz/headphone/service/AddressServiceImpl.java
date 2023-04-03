package com.xworkz.headphone.service;

import com.xworkz.headphone.dto.AddressDTO;
import static com.xworkz.headphone.util.ValidateUtil.*;
import com.xworkz.headphone.repo.AddressRepository;
import com.xworkz.headphone.util.ValidateUtil;

public class AddressServiceImpl implements AddressService {
	
	private AddressRepository repo;
	
	public AddressServiceImpl(AddressRepository repo) {
		this.repo=repo;
	}

	@Override
	public boolean validateAndThenSave(AddressDTO dto) {
		System.out.println("Running validateAndThenSave Method in AddressServiceImpl");
		if (dto != null) {
			System.out.println("dto is not null,hence we can validate");

			String street = dto.getState();
			String area = dto.getArea();
			int pinCode = dto.getPinCode();
			int floor = dto.getFloor();
			int number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getState();

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPinCode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;

			if (ValidateUtil.validString(street)) {
				System.out.println("Valid Street");
				validStreet = true;
			} else {
				System.out.println("Invalid street");
			}
			if (ValidateUtil.validString(area)) {
				System.out.println("Valid Area");
				validArea = true;
			} else {
				System.out.println("Invalid Area");
			}
			if (ValidateUtil.validInt(pinCode)) {
				System.out.println("Valid PinCode");
				validPinCode = true;
			} else {
				System.out.println("Invalid PinCode");
			}
			if (ValidateUtil.validInt(floor)) {
				System.out.println("Valid Floor");
				validFloor = true;
			} else {
				System.out.println("Invalid Floor");
			}
			if (ValidateUtil.validInt(number)) {
				System.out.println("Valid Number");
				validNumber = true;
			} else {
				System.out.println("Invalid Number");
			}
			if (ValidateUtil.validString(city)) {
				System.out.println("Valid City");
				validCity = true;
			} else {
				System.out.println("Invalid City");
			}
			if (ValidateUtil.validString(state)) {
				System.out.println("Valid State");
				validState = true;
			} else {
				System.out.println("Invalid State");
			}

			if (ValidateUtil.validFlag(validStreet, validArea, validPinCode, validFloor, validNumber, validCity,
					validState)) {
				System.out.println("Data are valid,we can save the data");
				boolean save=this.repo.save(dto);
				return true;
			} else {
				System.out.println("Data are not valid,we cannot save the data");
			}

		} else {
			System.out.println("DTO is null");
		}
		return false;
	}

	@Override
	public int total() {
		
		return this.repo.total();
	}

	@Override
	public AddressDTO findByNumber(int number) {
		if(ValidateUtil.validNumber(number)) {
			AddressDTO byNum=this.repo.findByNumber(number);
			 return byNum;
	}
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		if(ValidateUtil.validString(street)) {
			return this.repo.findByStreet(street);
	}
		
		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pinCode) {
		if(ValidateUtil.validInt(pinCode)) {
			return this.repo.findByPinCode(pinCode);
	}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(int pinCode, String area, String street) {
		if(validInt(pinCode)&& validString(area) && validString(street)) {
			return this.repo.findByStreetAndPinCodeAndArea(pinCode, area, street);
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		if(validString(city) && validString(state)) {
			return this.repo.findByCityAndState(city, state);
		}
		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		if(validInt(number)) {
			return this.repo.findFloorByNumber(number);
		}
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPinCode(int number, int floor, String street, int pinCode) {
		if(validInt(number) && validInt(floor) && validString(street) && validInt(pinCode)) {
			return this.repo.findCityByNumberAndFloorAndStreetAndPinCode(number, floor, street, pinCode);
		}
		return null;
	}

	@Override
	public int findPinCodeByNumber(int number) {
		if(validInt(number)) {
			return this.repo.findPinCodeByNumber(number);
		}
		return 0;
	}

}
