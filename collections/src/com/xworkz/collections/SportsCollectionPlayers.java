package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SportsCollectionPlayers {

	public static void main(String[] args) {
		
		
		
		System.out.println("-----------Cricket collections----------");
		Collection<String> cricket=new ArrayList<String>();
		cricket.add("Dhoni");
		cricket.add("Virat");
		cricket.add("Rahul");
		cricket.add("Jadeja");
		cricket.add("Dhavan");
		cricket.add("Bumrah");
		cricket.add("Panth");
		cricket.add("Bhuvaneshwar");
		cricket.add("Shami");
		
		for (String crick : cricket) {
			System.out.println(crick);
		}
		System.out.println("Toatal cricket size:"+cricket.size());
		
		
		System.out.println("-----------footBall collections----------");
		
		Collection<String> footBall=new ArrayList<String>();
		footBall.add("Ronaldo");
		footBall.add("Messi");
		footBall.add("Mbappe");
		footBall.add("Sunil ");
		footBall.add("Neymar");
		footBall.add("mark");
		
		for (String foot : footBall) {
			System.out.println(foot);
		}
		System.out.println("Total footBall size:"+footBall.size());
		
		System.out.println("-----------Kabaddi collections----------");
		Collection<String> kabbadi=new ArrayList<String>();
		kabbadi.add("pande");
		kabbadi.add("kun lee");
		kabbadi.add("tyzen");
		
		for (String kabb : kabbadi) {
			System.out.println(kabb);
		}
		System.out.println("Total kabbadi size:"+kabbadi.size());
		
//		Collection<Object> game=new ArrayList<Object>();
//		game.add("cricket");
//		game.add("football");
//		game.add("kabbadi");
		
		Collection<String> sports=new ArrayList<String>();
		sports.addAll(cricket);
		sports.addAll(footBall);
		sports.addAll(kabbadi);
		
		
//		System.out.println(sports);
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		System.out.println("Total Sports players Size:"+sports.size());
		System.out.println("---------Checking containsAll() method----------");
		System.out.println(sports.containsAll(cricket));
		
		System.out.println("------Checking retainAll() method------------");
		System.out.println(sports.retainAll(footBall));
		
		System.out.println("Total Sports players Size:"+sports.size());
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		
//		System.out.println("Running toArray(T[] a) methods");
//	
//		String agrs1=new String();
//		String[] args2=kabbadi.toArray(args1); 
//		System.out.println(Arrays.to);
		
//		String[] arr1=cricket.toArray(arr);
//		System.out.println(game.toArray());
//		for (Object sport : arr) {
//			System.out.println(sport);
//		}
		System.out.println("------Running toArray() methods-------");
		Object[]  arr=cricket.toArray();
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--------Running RemoveAll() Method------");
		System.out.println("Removed cricket collecions:"+cricket.removeAll(cricket));
		System.out.println("Removed footBall collecions:"+footBall.removeAll(footBall));
		System.out.println("Removed kabbadi collecions:"+kabbadi.removeAll(kabbadi));
		System.out.println("Cricket collection are:"+cricket);
		System.out.println("footBall collection are:"+footBall);
		System.out.println("kabbadi collection are:"+kabbadi);
		
		
		
		
	}

}
