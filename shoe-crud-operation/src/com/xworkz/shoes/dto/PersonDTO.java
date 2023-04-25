package com.xworkz.shoes.dto;

import java.io.Serializable;
import java.util.Objects;

public class PersonDTO implements Serializable{
	
	private String name;
	private String place;
	private String occupation;
	private int age;
	private int bYear;
	private double weight;
	private String motherToung;
	private boolean married;
	private String father;
	private String mother;
	
	
	public PersonDTO(String name, String place, String occupation, int age, int bYear, double weight,
			String motherToung, boolean married, String father, String mother) {
		super();
		this.name = name;
		this.place = place;
		this.occupation = occupation;
		this.age = age;
		this.bYear = bYear;
		this.weight = weight;
		this.motherToung = motherToung;
		this.married = married;
		this.father = father;
		this.mother = mother;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, bYear, father, married, mother, motherToung, name, occupation, place, weight);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonDTO other = (PersonDTO) obj;
		return age == other.age && bYear == other.bYear && Objects.equals(father, other.father)
				&& married == other.married && Objects.equals(mother, other.mother)
				&& Objects.equals(motherToung, other.motherToung) && Objects.equals(name, other.name)
				&& Objects.equals(occupation, other.occupation) && Objects.equals(place, other.place)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}


	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", place=" + place + ", occupation=" + occupation + ", age=" + age
				+ ", bYear=" + bYear + ", weight=" + weight + ", motherToung=" + motherToung + ", married=" + married
				+ ", father=" + father + ", mother=" + mother + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getbYear() {
		return bYear;
	}


	public void setbYear(int bYear) {
		this.bYear = bYear;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getMotherToung() {
		return motherToung;
	}


	public void setMotherToung(String motherToung) {
		this.motherToung = motherToung;
	}


	public boolean isMarried() {
		return married;
	}


	public void setMarried(boolean married) {
		this.married = married;
	}


	public String getFather() {
		return father;
	}


	public void setFather(String father) {
		this.father = father;
	}


	public String getMother() {
		return mother;
	}


	public void setMother(String mother) {
		this.mother = mother;
	}
	
	
	
}
