package com.xworkz.exception.boot;

public class Runner {

		   public static void main(String args[]){
		    try{
		          M m=new M();
		          m.method();

		    }catch(Exception e){System.out.println("exception handled");
		System.out.println("exception handled:"+e);
		}   

		    System.out.println("normal flow...");
		  }
		}

