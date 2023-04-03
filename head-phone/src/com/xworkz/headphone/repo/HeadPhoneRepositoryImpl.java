package com.xworkz.headphone.repo;

import com.xworkz.headphone.dto.HeadPhoneDTO;

public class HeadPhoneRepositoryImpl implements HeadPhoneRepository{
	
	private HeadPhoneDTO[] headPhones=new HeadPhoneDTO[5];
	private int headPhoneIndex=0;
	
	@Override
	public boolean save(HeadPhoneDTO dto) {
		System.out.println("Running save in headphone repo implementation:"+dto);
		
		if(this.headPhoneIndex<this.headPhones.length)
		{
			this.headPhones[headPhoneIndex]=dto;
			this.headPhoneIndex++;
			return true;
		}
		else
		{
			System.out.println("memory is full,cannot add more files,maximum allow");
			return false;
		}
		
	}

	

}
