package com.xworkz.association.dto;
import java.time.LocalDate;
import java.util.Objects;

public class AttendanceDTO {
	private String studentName;
	private int regNo;
	private double percentOfAttendance;
	private int numberOfAbsent;
	private LocalDate lastAttended;
	
	
	
	public AttendanceDTO() {
		System.out.println("No arg Constructor");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public double getPercentOfAttendance() {
		return percentOfAttendance;
	}
	public void setPercentOfAttendance(double percentOfAttendance) {
		this.percentOfAttendance = percentOfAttendance;
	}
	public int getNumberOfAbsent() {
		return numberOfAbsent;
	}
	public void setNumberOfAbsent(int numberOfAbsent) {
		this.numberOfAbsent = numberOfAbsent;
	}
	public LocalDate getLastAttended() {
		return lastAttended;
	}
	public void setLastAttended(LocalDate lastAttended) {
		this.lastAttended = lastAttended;
	}
	@Override
	public int hashCode() {
		return Objects.hash(lastAttended, numberOfAbsent, percentOfAttendance, regNo, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceDTO other = (AttendanceDTO) obj;
		return Objects.equals(lastAttended, other.lastAttended) && numberOfAbsent == other.numberOfAbsent
				&& Double.doubleToLongBits(percentOfAttendance) == Double.doubleToLongBits(other.percentOfAttendance)
				&& regNo == other.regNo && Objects.equals(studentName, other.studentName);
	}
	@Override
	public String toString() {
		return "AttendanceDTO [studentName=" + studentName + ", regNo=" + regNo + ", percentOfAttendance="
				+ percentOfAttendance + ", numberOfAbsent=" + numberOfAbsent + ", lastAttended=" + lastAttended + "]";
	}
	
	
	
	

}
