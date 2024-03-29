package com.xworkz.police.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public class MarriageDTO implements Serializable,Comparable<MarriageDTO>{
	@Min(value=1, message="value should be grater than 1")
	@Max(value=100, message="value shold be less than 100")
	private int id;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String brideName;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String groomName;
	private boolean arranged;
	@PastOrPresent
	private LocalDate date;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String hallName;
	@Min(value=1, message="value should be grater than 1")
	@Max(value=3000, message="value shold be less than 100")
	private int noOfPeopleInvited;
	private boolean dowry;

	public MarriageDTO(int id, String brideName, String groomName, boolean arranged, LocalDate date, String hallName,
			int noOfPeopleInvited, boolean dowry) {
		super();
		this.id = id;
		this.brideName = brideName;
		this.groomName = groomName;
		this.arranged = arranged;
		this.date = date;
		this.hallName = hallName;
		this.noOfPeopleInvited = noOfPeopleInvited;
		this.dowry = dowry;
	}

	@Override
	public String toString() {
		return "MarriageDTO [id=" + id + ", brideName=" + brideName + ", groomName=" + groomName + ", arranged="
				+ arranged + ", date=" + date + ", hallName=" + hallName + ", noOfPeopleInvited=" + noOfPeopleInvited
				+ ", dowry=" + dowry + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(arranged, brideName, date, dowry, groomName, hallName, id, noOfPeopleInvited);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarriageDTO other = (MarriageDTO) obj;
		return arranged == other.arranged && Objects.equals(brideName, other.brideName)
				&& Objects.equals(date, other.date) && dowry == other.dowry
				&& Objects.equals(groomName, other.groomName) && Objects.equals(hallName, other.hallName)
				&& id == other.id && noOfPeopleInvited == other.noOfPeopleInvited;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrideName() {
		return brideName;
	}

	public void setBrideName(String brideName) {
		this.brideName = brideName;
	}

	public String getGroomName() {
		return groomName;
	}

	public void setGroomName(String groomName) {
		this.groomName = groomName;
	}

	public boolean isArranged() {
		return arranged;
	}

	public void setArranged(boolean arranged) {
		this.arranged = arranged;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public int getNoOfPeopleInvited() {
		return noOfPeopleInvited;
	}

	public void setNoOfPeopleInvited(int noOfPeopleInvited) {
		this.noOfPeopleInvited = noOfPeopleInvited;
	}

	public boolean isDowry() {
		return dowry;
	}

	public void setDowry(boolean dowry) {
		this.dowry = dowry;
	}

	@Override
	public int compareTo(MarriageDTO o) {
		
		return this.brideName.compareTo(o.brideName);
	}
	

}
