package com.xworkz.animal.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.animal.consts.Type;

public class AnimalDTO implements Serializable{
	private String name;
//	private Type type;
	private int lifeSpan;
	private double weight;
	private double height;
	
	public AnimalDTO() {
		System.out.println("no args constructor");
	}
	
	
	
	public AnimalDTO(String name, int lifeSpan, double weight, double height) {
		super();
		this.name = name;
		this.lifeSpan = lifeSpan;
		this.weight = weight;
		this.height = height;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public int hashCode() {
		return Objects.hash(height, lifeSpan, name, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalDTO other = (AnimalDTO) obj;
		return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height) && lifeSpan == other.lifeSpan
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	@Override
	public String toString() {
		return "AnimalDTO [name=" + name + ", lifeSpan=" + lifeSpan + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	

}
