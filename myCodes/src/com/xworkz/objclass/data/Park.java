package com.xworkz.objclass.data;

public class Park {
	private String park_Name;
	private String location;
	private int squareFeet;
	private int year_Established;
	private int no_Of_Visitors;
	private int entryFess;

	public Park() {
		System.out.println("park const with no argument");
	}

	public Park(String park_Name, String location, int squareFeet, int year_Established, int no_Of_Visitors,
			int entryFess) {
		this.park_Name = park_Name;
		this.location = location;
		this.squareFeet = squareFeet;
		this.year_Established = year_Established;
		this.no_Of_Visitors = no_Of_Visitors;
		this.entryFess = entryFess;
	}

	@Override
	public String toString() {
		return "[park_Name:" + park_Name + "][location:" + location + "][squareFeet:" + squareFeet
				+ "][year_Established:" + year_Established + "][no_Of_Visitors:" + no_Of_Visitors + "][entryFess:"
				+ entryFess + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running properties Park:" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Park) {
				System.out.println("Object is Park type, can compare");
				Park casted = (Park) obj;
				Park park1 = this;
				Park park2 = casted;
				if (park1.park_Name.equals(park2.park_Name) && park1.location.equals(park2.location)
						&& park1.squareFeet == (park2.squareFeet) && park1.year_Established == (park2.year_Established)
						&& park1.no_Of_Visitors == (park2.no_Of_Visitors) && park1.entryFess == (park2.entryFess)) {
					System.out.println("Park prperties are same");
					return true;
				}

			} else {
				System.err.println("Object is not Park type, cannot compare");

			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

}
