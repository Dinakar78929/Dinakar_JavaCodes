package com.xworkz.association.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.association.consts.WeaponType;

public class WeaponDTO implements Serializable{
	
	private int id;
	private String name;
	private WeaponType type;
	private double cost;
	private String matetial;
	private String madeBy;
	private String manfactureBy;
	private LocalDate manufacturedYear;
	private String usedBy;
	private String usedFor;
	private double weight;
	
	
	public WeaponDTO() {
		System.out.println("No args constructor");
	}
	
	public WeaponDTO(int id, String name, WeaponType type, double cost, String matetial, String madeBy,
			String manfactureBy, LocalDate manufacturedYear, String usedBy, String usedFor, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.matetial = matetial;
		this.madeBy = madeBy;
		this.manfactureBy = manfactureBy;
		this.manufacturedYear = manufacturedYear;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.weight = weight;
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

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMatetial() {
		return matetial;
	}

	public void setMatetial(String matetial) {
		this.matetial = matetial;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getManfactureBy() {
		return manfactureBy;
	}

	public void setManfactureBy(String manfactureBy) {
		this.manfactureBy = manfactureBy;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(LocalDate manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, madeBy, manfactureBy, manufacturedYear, matetial, name, type, usedBy, usedFor,
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
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(madeBy, other.madeBy) && Objects.equals(manfactureBy, other.manfactureBy)
				&& Objects.equals(manufacturedYear, other.manufacturedYear) && Objects.equals(matetial, other.matetial)
				&& Objects.equals(name, other.name) && type == other.type && Objects.equals(usedBy, other.usedBy)
				&& Objects.equals(usedFor, other.usedFor)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + ", matetial=" + matetial
				+ ", madeBy=" + madeBy + ", manfactureBy=" + manfactureBy + ", manufacturedYear=" + manufacturedYear
				+ ", usedBy=" + usedBy + ", usedFor=" + usedFor + ", weight=" + weight + "]";
	}
	
	
	
	
	
	

}
