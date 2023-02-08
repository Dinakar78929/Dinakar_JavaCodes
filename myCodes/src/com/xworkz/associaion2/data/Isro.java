package com.xworkz.associaion2.data;

public class Isro {
	public String[] locations;
	public int[] sateliteNos;
	public Scientist[] scientists;
	
	public Isro()
	{
		
	}
	public void setLocations(String[] locations)
	{
		this.locations=locations;
	}
	public void setSateliteNos(int[] sateliteNos)
	{
		this.sateliteNos=sateliteNos;
	}
	public void setScientist(Scientist[] scientists) {
		this.scientists=scientists;
	}
	public void display()
	{
		if(this.locations!=null) {
			for(int seq=0;seq<this.locations.length;seq++) {
				String element=this.locations[seq];
				System.out.println("Locations:"+element+"at index"+seq);
			}
		}
		else {
			System.out.println("this.locations is null");
		}
		if(this.sateliteNos!=null) {
			for(int num=0;num<this.sateliteNos.length;num++) {
				int element=this.sateliteNos[num];
				System.out.println("sateliteNos:  "+element+"  at index"+num);
			}
		}
		else {
			System.out.println("this.sateliteNos is null");
		}
		
		
		if(this.scientists!=null) {
			for(int seq=0;seq<this.scientists.length;seq++) {
				Scientist element=this.scientists[seq];
				System.out.println("scientists at index:"+seq);
				element.show();
			}
		}
		else {
			System.err.println("this.scientist is null");
		}
		
	}
}


