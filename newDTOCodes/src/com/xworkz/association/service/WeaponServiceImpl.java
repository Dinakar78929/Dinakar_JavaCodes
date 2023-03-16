package com.xworkz.association.service;

import java.time.LocalDate;

import com.xworkz.association.consts.WeaponType;
import com.xworkz.association.dto.WeaponDTO;

public class WeaponServiceImpl implements WeaponService {

	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {
		if (dto != null) {
			int id = dto.getId();
			String name = dto.getName();
			WeaponType type = dto.getType();
			double cost = dto.getCost();
			String matetial = dto.getMatetial();
			String madeBy = dto.getMadeBy();
			String manfactureBy = dto.getManfactureBy();
			LocalDate manufacturedYear = dto.getManufacturedYear();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();

			boolean validId = false;
			boolean validName = false;
			boolean validType = false;
			boolean validCost = false;
			boolean validMatetial = false;
			boolean validMadeBy = false;
			boolean validManfactureBy = false;
			boolean validManufacturedYear = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;

			if (id > 0) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.out.println("invalid id");
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("valid Name");
				validName = true;
			} else {
				System.out.println("invalid Name");
			}
			if (type != null) {
				System.out.println("valid type");
				validType = false;
			} else {
				System.out.println("invalid type");
			}
			if (cost > 100 && cost < 100000) {
				System.out.println("valid cost");
				 validCost = false;
			} else {
				System.out.println("invalid cost");
			}
			if (matetial != null && !matetial.isEmpty() && matetial.length() > 3 && matetial.length() < 30) {
				System.out.println("valid matetial");
				validMatetial = false;
			} else {
				System.out.println("invalid matetial");
			}
			if (madeBy != null && !madeBy.isEmpty() && madeBy.length() > 3 && madeBy.length() < 30) {
				System.out.println("valid madeBy");
				validMadeBy = false;
			} else {
				System.out.println("invalid madeBy");
			}
			if (manfactureBy != null && !manfactureBy.isEmpty() && manfactureBy.length() > 3
					&& manfactureBy.length() < 30) {
				System.out.println("valid manfactureBy");
				 validManfactureBy = false;
			} else {
				System.out.println("invalid manfactureBy");
			}
			LocalDate today = LocalDate.now();
			if (manufacturedYear != null && manufacturedYear.isBefore(today)) {
				System.out.println("valid manufacturedYear");
				validManufacturedYear = false;
			} else {
				System.out.println("invalid manufacturedYear");
			}
			if (usedBy != null && !usedBy.isEmpty() && usedBy.length() > 3 && usedBy.length() < 30) {
				System.out.println("valid usedBy");
				 validUsedBy = false;
			} else {
				System.out.println("invalid usedBy");
			}
			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 3 && usedFor.length() < 30) {
				System.out.println("valid usedFor");
				validUsedFor = false;
			} else {
				System.out.println("invalid usedFor");
			}
			if (weight > 250 && weight < 1000) {
				System.out.println("valid weight");
				validWeight = false;
			} else {
				System.out.println("invalid weight");
			}
			
			if(validId && validName && validType && validCost && validMatetial && validMadeBy && validManfactureBy && validManufacturedYear && validUsedBy && validUsedFor &&  validWeight)
			{
				System.out.println("All are corect vlid");
			}
			return true;
			} 
			else {
			System.err.println("dto is null");
		}
		return false;
	}

}
