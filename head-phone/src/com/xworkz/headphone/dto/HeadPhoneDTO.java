package com.xworkz.headphone.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.TypeAndWeight;

public class HeadPhoneDTO implements Serializable{
	private Brand brand;
	private String modelNo;
	private double price;
	private boolean bass;
	private Color color;
	private TypeAndWeight weight;
	private String customerName;
	private int invoiceNo;
	private LocalDate mgfDate;
	private int warrantyPeriod;
	
	public HeadPhoneDTO() 
	{
		
	}
	
	public HeadPhoneDTO(Brand brand, String modelNo, double price, boolean bass, Color color, TypeAndWeight weight,
			String customerName, int invoiceNo, LocalDate mgfDate, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.modelNo = modelNo;
		this.price = price;
		this.bass = bass;
		this.color = color;
		this.weight = weight;
		this.customerName = customerName;
		this.invoiceNo = invoiceNo;
		this.mgfDate = mgfDate;
		this.warrantyPeriod = warrantyPeriod;
	}
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TypeAndWeight getWeight() {
		return weight;
	}

	public void setWeight(TypeAndWeight weight) {
		this.weight = weight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public LocalDate getMgfDate() {
		return mgfDate;
	}

	public void setMgfDate(LocalDate mgfDate) {
		this.mgfDate = mgfDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bass, brand, color, customerName, invoiceNo, mgfDate, modelNo, price, warrantyPeriod,
				weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadPhoneDTO other = (HeadPhoneDTO) obj;
		return bass == other.bass && Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(customerName, other.customerName) && invoiceNo == other.invoiceNo
				&& Objects.equals(mgfDate, other.mgfDate) && Objects.equals(modelNo, other.modelNo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& warrantyPeriod == other.warrantyPeriod && Objects.equals(weight, other.weight);
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [brand=" + brand + ", modelNo=" + modelNo + ", price=" + price + ", bass=" + bass
				+ ", color=" + color + ", weight=" + weight + ", customerName=" + customerName + ", invoiceNo="
				+ invoiceNo + ", mgfDate=" + mgfDate + ", warrantyPeriod=" + warrantyPeriod + "]";
	}
	
	
	

}
