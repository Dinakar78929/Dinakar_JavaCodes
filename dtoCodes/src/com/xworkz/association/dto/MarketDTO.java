package com.xworkz.association.dto;

import java.util.Objects;

public class MarketDTO {
	private String name;
	private String area;
	private int squareFeet;
	private String holiday;
	
	public MarketDTO() {
		System.out.println("no args constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, holiday, name, squareFeet);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(holiday, other.holiday)
				&& Objects.equals(name, other.name) && squareFeet == other.squareFeet;
	}
	@Override
	public String toString() {
		return "MarketDTO [name=" + name + "],\n"+ " ["+ " area=" + area + "],\n[ "
						+ "squareFeet=" + squareFeet 
						+ "],\n[ holiday=" + holiday
				+ "]";
	}
	
	

}
