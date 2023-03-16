package com.xworkz.association.boot;

import java.time.LocalDate;

import com.xworkz.association.consts.WeaponType;
import com.xworkz.association.dto.WeaponDTO;
import com.xworkz.association.service.WeaponService;
import com.xworkz.association.service.WeaponServiceImpl;

public class WeaponDTORunner 
{

	public static void main(String[] args) 
	{
		WeaponDTO weapon= new WeaponDTO(134,"Shooting",WeaponType.GUN,55000.0,"steel","Darshan","DarshanWeaponFactory",LocalDate.of(2015,5,2),"Jayanth","Murder",500.0);
		System.out.println(weapon);
	
		WeaponService weaponService=new WeaponServiceImpl();
		boolean saved=weaponService.validateAndThenSave(weapon);
		System.out.println("Saved  "+saved);
		
	}
}
