package com.xworkz.headphone.repo;

import com.xworkz.headphone.dto.AddressDTO;

public interface AddressRepository {
	public boolean save(AddressDTO repo);

	public boolean isExist(AddressDTO repo);
	
	int total();

	AddressDTO findByNumber(int number);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByPinCode(int pinCode);

	AddressDTO findByStreetAndPinCodeAndArea(int pinCode, String area, String street);

	AddressDTO findByCityAndState(String city, String state);

	int findFloorByNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPinCode(int number, int floor, String street, int pinCode);

	int findPinCodeByNumber(int number);

}
