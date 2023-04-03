package com.xworkz.headphone.repo;

import com.xworkz.headphone.dto.AddressDTO;

public class AddressRepositoryImpl implements AddressRepository{
	
	private AddressDTO[] adresses=new AddressDTO[5];
	private int addressIndex=0;

	@Override
	public boolean save(AddressDTO repo) {
		if(this.addressIndex<this.adresses.length) {
			adresses[addressIndex]=repo;
			System.out.println("Saving is Coorect");
			this.addressIndex++;
			return true;
		}
		else
		{
			System.out.println("Memory is full,we cannot Save");
		}
		return false;
	}

	@Override
	public boolean isExist(AddressDTO repo) {
		if(addressIndex==0) {
			System.out.println("first element is not exist,we cannot check");
			return false;
		}
		else {
			System.out.println("First element is exist,we can check");
			for(int addressIndex=0;addressIndex<adresses.length;addressIndex++) {
				AddressDTO ref=this.adresses[addressIndex];
				if(ref.equals(repo)) {
					System.out.println("repo is exist");
					return true;
				}
				else
				{
					System.err.println("repo don't exist");
				}
			}
		}
		
		return false;
	}

	@Override
	public int total() {
		
		return this.addressIndex;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getNumber()==number) {
				System.out.println("dto is found for number");
				return ref;
			}
		}
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) {
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getStreet().equals(street)) {
				System.out.println("dto is found for street");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pinCode) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getPinCode()==pinCode) {
				System.out.println("dto is found for pinCode");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(int pinCode, String area, String street) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getPinCode()==pinCode && ref.getArea().equals(area) && ref.getStreet().equals(street)) {
				System.out.println("dto is found for pinCode,area,street");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getCity().equals(city) && ref.getState().equals(state)) {
				System.out.println("dto is found for city,state");
				return ref;
			}
		}
		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getNumber()==number) {
				System.out.println("dto is found for Floor ,Number");
				return ref.getFloor();
			}
		}
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPinCode(int number, int floor, String street, int pinCode) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getNumber()==number && ref.getFloor()==floor && ref.getStreet().equals(street)) {
				System.out.println("dto is found for number,Floor,Street,PinCode");
				return ref.getCity();
			}
		}
		return null;
	}

	@Override
	public int findPinCodeByNumber(int number) {
		for(int addressIndex=0;addressIndex<this.adresses.length;addressIndex++) {
			AddressDTO ref=this.adresses[addressIndex];
			if(ref.getNumber()==number) {
				System.out.println("dto is found for PinCode ,Number");
				return ref.getPinCode();
			}
		}
		return 0;
	}

}
