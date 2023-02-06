package com.xworkz.constructor.data;

public class Xworkz {
	public String inst_Name;
	public String founder;
	public String location;
	public int foundingYear;
	public int noOfStudent;
	public int noOfTrainer;
	public String courses;
	public int trainingFee;
	public String certificationOffered;
	public  Trainee trainee  = new Trainee(3,"om",true);
	
	public Xworkz()
	{
		
	}

	
	public Xworkz(String inst_Name,String founder,String location,int foundingYear,int noOfStudent,int noOfTrainer,String courses,int trainingFee,String certificationOffered) {
		this.inst_Name=inst_Name;
		this.founder=founder;
		this.location=location;
		this.foundingYear=foundingYear;
		this.noOfStudent=noOfStudent;
		this.noOfTrainer=noOfTrainer;
		this.courses=courses;
		this.trainingFee=trainingFee;
		this.certificationOffered=certificationOffered;
		this.trainee.showTrainer();
	}
	public void showXworkz() {
		System.out.println("Institute Name:"+inst_Name);
		System.out.println("founder:"+founder);
		System.out.println("location:"+location);
		System.out.println("foundingYear:"+foundingYear);
		System.out.println("noOfStudent:"+noOfStudent);
		System.out.println("noOfTrainer:"+noOfTrainer);
		System.out.println("courses:"+courses);
		System.out.println("trainingFee:"+trainingFee);
		System.out.println("certificationOffered:"+certificationOffered);
		}
	
	}
