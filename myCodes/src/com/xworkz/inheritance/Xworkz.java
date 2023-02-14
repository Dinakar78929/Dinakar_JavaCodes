package com.xworkz.inheritance;
import com.xworkz.inheritance.data.Institute;

public class Xworkz extends Institute {
	public Xworkz()
	{
		System.out.println("No argument cunstructor");
	}
	public Xworkz(String owner)
	{
		
		System.out.println("cunstructor with name parameter"+owner);
	}
	public Xworkz(String owner,long contact)
	{
		super("Xworkz");
		System.out.println("Institute name:"+owner);
		System.out.println("contact number:"+contact);
	}
	public Xworkz(String owner,long contact,int trainer)
	{
		
		System.out.println("owner:"+owner);
		System.out.println("contact number:"+contact);
		System.out.println("no of trainee:"+trainer);
	}
	public Xworkz(String owner,long contact,int trainer,int fee)
	{
		System.out.println("Institute owner:"+owner);
		System.out.println("contact number:"+contact);
		System.out.println("no of trainee:"+trainer);
		System.out.println("fee:"+fee);
		}
	}
