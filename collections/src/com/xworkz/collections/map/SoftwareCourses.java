package com.xworkz.collections.map;
import java.util.HashMap;
import java.util.Map;

public class SoftwareCourses {
	

		public static void main(String[] args) {
			
			Map<Integer, String> courses=new HashMap<>();
			
			courses.put(1, "Java");
			courses.put(2, "Web Tech");
			courses.put(3, "MySQL");
			courses.put(4, "Data Analyst");
			courses.put(5, "REDHAT");
			courses.put(6, ".Net");
			courses.put(7, "SAP");
			courses.put(8, "Phython");
			courses.put(9, "JDBC");
			courses.put(10, "Networking");
			
			System.out.println(courses);
			
			courses.remove(4);
			courses.remove(6, ".Net");
			System.out.println(courses);
			
			System.out.println(courses.keySet());
			System.out.println(courses.values());
			System.out.println(courses.entrySet());
			
			courses.clear();
			System.out.println(courses);
			
			
		}
	}

