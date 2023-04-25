package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.Objects;

public class GroceryDTO implements Serializable{
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	
	public GroceryDTO(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, quantity);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryDTO other = (GroceryDTO) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}


	@Override
	public String toString() {
		return "GroceryDTO [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


//	@Override
//	public int compareTo(GroceryDTO o) {
//		
//		return Integer.compare(this.getId(),o.getId());
//	}


	public int compareTo(GroceryDTO o) {

		return Integer.compare(this.getId(),o.getId());
	}


	
	

}
