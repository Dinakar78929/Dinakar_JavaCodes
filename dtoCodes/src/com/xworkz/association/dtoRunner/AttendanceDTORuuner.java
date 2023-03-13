package com.xworkz.association.dtoRunner;
import com.xworkz.association.dto.AttendanceDTO;

public class AttendanceDTORuuner {

	public static void main(String[] args) {
		
		AttendanceDTO attendance=new AttendanceDTO();
		attendance.setStudentName("Dhananjay");
		attendance.setRegNo(56789);
		attendance.setPercentOfAttendance(75.7);
		attendance.setNumberOfAbsent(20);
		attendance.setLastAttended(null);
		
		System.out.println(attendance);
		System.out.println(attendance.equals(attendance));
		System.out.println("hashCode:"+attendance.hashCode()+" "+ "oroginalhashCode:"+System.identityHashCode(attendance));

	}

}
