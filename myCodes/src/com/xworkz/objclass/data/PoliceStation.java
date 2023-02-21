package com.xworkz.objclass.data;

public class PoliceStation {
	private String station_Name;
	private String location;
	private int number_Of_Officers;
	private String chief_Of_Police;
	private String name_Of_SI;
	private long phone_Number;
	private String types_Of_Crime;
	private int number_Of_LadyOfficer;
	private int no_Of_Prisoners;
	private int no_Of_Crimes;

	public PoliceStation() {
		System.out.println("policeStation const with no argument");
	}

	public PoliceStation(String station_Name, String location, int number_Of_Officers, String chief_Of_Police,
			String name_Of_SI, long phone_Number, String types_Of_Crime, int number_Of_LadyOfficer, int no_Of_Prisoners,
			int no_Of_Crimes) {
		this.station_Name = station_Name;
		this.location = location;
		this.number_Of_Officers = number_Of_Officers;
		this.chief_Of_Police = chief_Of_Police;
		this.name_Of_SI = name_Of_SI;
		this.phone_Number = phone_Number;
		this.types_Of_Crime = types_Of_Crime;
		this.number_Of_LadyOfficer = number_Of_LadyOfficer;
		this.no_Of_Prisoners = no_Of_Prisoners;
		this.no_Of_Crimes = no_Of_Crimes;

	}

	@Override
	public String toString() {
		return "[station_Name:" + station_Name + "][location:" + location + "][number_Of_Officers:" + number_Of_Officers
				+ "][chief_Of_Police:" + chief_Of_Police + "][name_Of_SI:" + name_Of_SI + "][phone_Number:"
				+ phone_Number + "][types_Of_Crime:" + types_Of_Crime + "][number_Of_LadyOfficer:"
				+ number_Of_LadyOfficer + "][no_Of_Prisoners:" + no_Of_Prisoners + "][no_Of_Crimes:" + no_Of_Crimes
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running properties of PiliceStation:"+obj);
		if(obj!=null)
		{
			System.out.println("Object is not null");
			if(obj instanceof PoliceStation) 
			{
				System.out.println("Object is a type of PoliceStation,can compare");
				PoliceStation casted=(PoliceStation)obj;
				PoliceStation police1=this;
				PoliceStation police2=casted;
				
				if(		police1.station_Name.equals(police2.station_Name)
						&& police1.location.equals(police2.location) 
						&& police1.number_Of_Officers==(police2.number_Of_Officers)
						&& police1.chief_Of_Police.equals(police2.chief_Of_Police)
						&& police1.name_Of_SI.equals(police2.name_Of_SI) 
						&& police1.phone_Number==(police2.phone_Number)
						&& police1.types_Of_Crime.equals(police2.types_Of_Crime)
						&& police1.number_Of_LadyOfficer==(police2.number_Of_LadyOfficer) 
						&& police1.no_Of_Prisoners==(police2.no_Of_Prisoners)
						&& police1.no_Of_Crimes==(police2.no_Of_Crimes))
				{
					System.out.println("PoliceStation properties are same");
					return true;
				}
				else {
					System.err.println("PoliceStation properties are different");
				}
						
						
			}
			else
			{
				System.err.println("Object is not a type of PoliceStation,cannot compare");
			}
		}
		else 
		{
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

}
