package com.xworkz.headphone.service;

import java.time.LocalDate;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.TypeAndWeight;
import com.xworkz.headphone.dto.HeadPhoneDTO;
import com.xworkz.headphone.repo.HeadPhoneRepository;
import com.xworkz.headphone.util.ValidateUtil;
//import com.xworkz.headphone.util.ValidateUtil.*;

public class HeadPhoneServiceImpl implements HeadPhoneService {

	private HeadPhoneRepository repo;

	public HeadPhoneServiceImpl(HeadPhoneRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndThenSave(HeadPhoneDTO dto) {
		System.out.println("Running validateAndThenSave");
		if (dto != null) {
			System.out.println("DTO is not null");
			Brand brand = dto.getBrand();
			String modelNo = dto.getModelNo();
			double price = dto.getPrice();
			boolean bass = dto.isBass();
			Color color = dto.getColor();
			TypeAndWeight weight = dto.getWeight();
			String customerName = dto.getCustomerName();
			int invoiceNo = dto.getInvoiceNo();
			LocalDate mgfDate = dto.getMgfDate();
			int warrantyPeriod = dto.getWarrantyPeriod();

			boolean validBrand = false;
			boolean validModelNo = false;
			boolean validPrice = false;
			boolean validBass = false;
			boolean validColor= false;
			boolean validWeight = false;
			boolean validCustomerName = false;
			boolean validInvoiceNo = false;
			boolean validMgfDate = false;
			boolean validWarrantyPeriod = false;

			if (brand != null) {
				System.out.println("valid Brand");
				validBrand = true;
			} else {
				System.out.println("invalid Brand");
			}
			if (color != null) {
				System.out.println("valid color");
				validColor = true;
			} else {
				System.out.println("invalid color");
			}
			if (weight != null) {
				System.out.println("valid weight");
				validWeight = true;
			} else {
				System.out.println("invalid weight");
			}

			if (ValidateUtil.validString(modelNo)) {
				System.out.println("valid madelNo");
				validModelNo = true;
			} else {
				System.err.println("invalid madelNo");
			}

			if (ValidateUtil.validPrice(price)) {
				System.out.println("valid price");
				validPrice = true;
			} else {
				System.out.println("invalid price");
			}

			if (bass) {
				System.out.println("valid Bass");
				validBass = true;
			} else {
				System.out.println("invalid Bass");
			}

			if (ValidateUtil.validString(customerName)) {
				System.out.println("valid customerName");
				validCustomerName = true;
			} else {
				System.err.println("invalid customerName");
			}
			if (ValidateUtil.validNumber(invoiceNo)) {
				System.out.println("valid invoiceNo");
				validInvoiceNo = true;
			} else {
				System.err.println("invalid invoiceNo");
			}
			if (ValidateUtil.validNumber(warrantyPeriod)) {
				System.out.println("valid warrantyPeriod");
				validWarrantyPeriod = true;
			} else {
				System.err.println("invalid warrantyPeriod");
			}

			if (ValidateUtil.validDate(mgfDate, LocalDate.of(2000, 1, 1))) {
				System.out.println("valid mgfDate");
				validMgfDate = true;
			} else {
				System.err.println("invalid mgfDate");
			}
			if (ValidateUtil.validFlag(validBrand, validModelNo, validPrice, validBass, validColor, validWeight,
					validCustomerName, validInvoiceNo, validMgfDate, validWarrantyPeriod)) {
				System.out.println("Data is valid we can save");
				return true;
			} else {
				System.err.println("Data is invalid we cannot save");
			}
		} else {
			System.err.println("DTO IS NULL");
		}

		return false;
	}

}
