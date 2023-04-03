package com.xworkz.headphone.boot;

import com.xworkz.headphone.dto.AddressDTO;
import com.xworkz.headphone.repo.AddressRepository;
import com.xworkz.headphone.repo.AddressRepositoryImpl;
import com.xworkz.headphone.service.AddressService;
import com.xworkz.headphone.service.AddressServiceImpl;

public class AddressDTORunner {

	public static void main(String[] args) {
		AddressDTO addressDTO=new AddressDTO("12th cross","prakasnagarasdflkiuytfdfghjkjhgfdfghjh",577144,2,78929778,"Bengaluru", "Karnataka");
		AddressDTO addressDTO1=new AddressDTO("11th cross","Gandisnagar",577111,3,78924567,"Mysure", "Karnataka");
		
		AddressRepository addressRepository=new AddressRepositoryImpl();
		
		AddressService addressService=new AddressServiceImpl(addressRepository);
		
		boolean save=addressService.validateAndThenSave(addressDTO);
		System.out.println(save);
		
		boolean save1=addressService.validateAndThenSave(addressDTO1);
		System.out.println(save1);
		
		int flr=addressService.findFloorByNumber(78929778);
		System.out.println(flr);
		
		String cty=addressService.findCityByNumberAndFloorAndStreetAndPinCode(78929778, 2, "12th cross", 577144);
		System.out.println(cty);
	}
	

}
