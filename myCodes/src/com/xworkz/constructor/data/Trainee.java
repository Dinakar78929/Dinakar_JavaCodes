package com.xworkz.constructor.data;

public class Trainee {
		public int noOfTrainers;
		public String name;
		public boolean goodTeaching;

		public Trainee(int noOfTrainers, String name, boolean goodTeaching) 
		{
			this.noOfTrainers = noOfTrainers;
			this.name = name;
			this.goodTeaching = goodTeaching;
		}

		public void showTrainer() {
			System.out.println("\n-----------");
			System.out.println("Xworkz has how many trainers: " + noOfTrainers);
			System.out.println("Xworkz has been teaching: " + name);
			System.out.println("Xworkz has good teaching " + goodTeaching);
		}
	}


