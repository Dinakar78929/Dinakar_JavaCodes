package com.xworkz.constructor.data;

public class Train {
	String name;
	int number;
	int coaches;
	char coachName;
	int capacity;
	String timing;
	int engine;
	String coachType;
	public Train()
	{
		
	}
	public Train(String nm)
	{
		name=nm;
	}
	public Train(String nm,int num)
	{
		name=nm;
		number=num;
	}
	public Train(String nm,int num,int chs)
	{
		name=nm;
		number=num;
		coaches=chs;
	}
	public Train(String nm,int num,int chs,char chnm)
	{
		name=nm;
		number=num;
		coaches=chs;
		coachName=chnm;
	}
	public Train(String nm,int num,int chs,char chnm,int cpy)
	{
		name=nm;
		number=num;
		coaches=chs;
		coachName=chnm;
		capacity=cpy;
	}
	public Train(String nm,int num,int chs,char chnm,int cpy,String tmg)
	{
		name=nm;
		number=num;
		coaches=chs;
		coachName=chnm;
		capacity=cpy;
		timing=tmg;
	}
	public Train(String nm,int num,int chs,char chnm,int cpy,String tmg,int eng)
	{
		name=nm;
		number=num;
		coaches=chs;
		coachName=chnm;
		capacity=cpy;
		timing=tmg;
		engine=eng;
	}
	public Train(String nm,int num,int chs,char chnm,int cpy,String tmg,int eng,String chtyp)
	{
		name=nm;
		number=num;
		coaches=chs;
		coachName=chnm;
		capacity=cpy;
		timing=tmg;
		engine=eng;
		coachType=chtyp;
	}
	public void show()
	{
		System.out.println("------Train Details start--------");
		System.out.println("Train name :"+name);
		System.out.println("Train number:"+number);
		System.out.println("number of coaches:"+coaches);
		System.out.println("coach name:"+coachName);
		System.out.println("number of seats:"+capacity);
		System.out.println("timings:"+timing);
		System.out.println("number of engine:"+engine);
		System.out.println("coachtype:"+coachType);
		System.out.println("------Train Details end--------");
	}
}