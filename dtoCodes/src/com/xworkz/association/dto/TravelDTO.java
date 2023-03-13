package com.xworkz.association.dto;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO {
	private String placeName;
	private double distance;
	private double travelDuration;
	private String vehical;
	private LocalDate travelDate;
	
	public TravelDTO() {
		System.out.println("No arg Constructor");
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTravelDuration() {
		return travelDuration;
	}

	public void setTravelDuration(double travelDuration) {
		this.travelDuration = travelDuration;
	}

	public String getVehical() {
		return vehical;
	}

	public void setVehical(String vehical) {
		this.vehical = vehical;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distance, placeName, travelDate, travelDuration, vehical);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Double.doubleToLongBits(distance) == Double.doubleToLongBits(other.distance)
				&& Objects.equals(placeName, other.placeName) && Objects.equals(travelDate, other.travelDate)
				&& Double.doubleToLongBits(travelDuration) == Double.doubleToLongBits(other.travelDuration)
				&& Objects.equals(vehical, other.vehical);
	}

	@Override
	public String toString() {
		return "TravelDTO [placeName=" + placeName + ", distance=" + distance + ", travelDuration=" + travelDuration
				+ ", vehical=" + vehical + ", travelDate=" + travelDate + "]";
	}
	
	
	
	
	

}
