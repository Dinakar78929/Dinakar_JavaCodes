package com.xworkz.shoes.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.shoes.constants.Type;

public class ShoeDTO implements Serializable{
	
	private String brand;
	private Type type;
	private double price;
	private int size;
	private int warranty;
	
	public ShoeDTO() {
		System.out.println("no args constructor");
	}

	public ShoeDTO(String brand, Type type, double price, int size, int warranty) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.size = size;
		this.warranty = warranty;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, price, size, type, warranty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoeDTO other = (ShoeDTO) obj;
		return Objects.equals(brand, other.brand)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && size == other.size
				&& type == other.type && warranty == other.warranty;
	}

	@Override
	public String toString() {
		return "ShoeDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", size=" + size + ", warranty="
				+ warranty + "]";
	}
	
	
	

}
