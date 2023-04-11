package com.xworkz.college.dto;

import java.io.Serializable;
import java.util.Objects;

public class CollegeDTO implements Serializable{
	
	private int id;
	private String name;
	private String owner;
	private String location;
	private double fees;
	
	public CollegeDTO() {
		System.out.println("No argument constructor");
	}

	public CollegeDTO(int id, String name, String owner, String location, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.fees = fees;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fees, id, location, name, owner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollegeDTO other = (CollegeDTO) obj;
		return Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(owner, other.owner);
	}

	@Override
	public String toString() {
		return "CollegeDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", location=" + location + ", fees="
				+ fees + "]";
	}
	
	
	
	

}
