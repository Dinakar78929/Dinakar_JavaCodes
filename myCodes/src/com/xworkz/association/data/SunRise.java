package com.xworkz.association.data;

public class SunRise {
	public String place;
	public String time;
	public boolean beautiful;
	public Sun sun;
	
	public SunRise()
	{
		
	}

	
	public SunRise(String place, String time, boolean beautiful) {
		this.place = place;
		this.time = time;
		this.beautiful = beautiful;
	}
	public void init(String place, String time, boolean beautiful) {
		
		this.place = place;
		this.time = time;
		this.beautiful = beautiful;
	}


	
	public void init(Sun sun)
	{
		this.sun=sun;
	}
	public void show()
	{
		System.out.println("Sunrice details are:");
		System.out.println("Sunrice place:"+place);
		System.out.println("timings:"+time);
		System.out.println("beautiful:"+beautiful);
		if(this.sun!=null) {
			this.sun.showSun();
	}
	else
	{
		System.err.println("this.sun is not pointing to sun");
		
	}

	

}

}
