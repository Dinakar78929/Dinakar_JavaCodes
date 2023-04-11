package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Movie {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		System.out.println("-----------String datas----------");
		names.add("Arjun");
		names.add("Dinakar");
		names.add("Manoj");
		names.add("Jayanth");
		names.add("Darshan");
		names.add("Rocky");
		names.add("Shivu");
		names.add("Kavana");
		names.add("Divya");
		names.add("Soujanya");
		names.add(1,"Druva");

		System.out.println(names);
		System.out.println("String array Size:" + names.size());

		List<Integer> marksScored = new LinkedList<Integer>();
		System.out.println("---------Integer datas------");
		marksScored.add(70);
		marksScored.add(90);
		marksScored.add(99);
		marksScored.add(89);
		marksScored.add(45);
		marksScored.add(20);
		marksScored.add(67);
		marksScored.add(94);
		marksScored.add(100);
		marksScored.add(55);

		int indexValue = marksScored.get(5);
		marksScored.set(5, 25);
		int indexValue1 = marksScored.get(5);
		int size = marksScored.size();
		System.out.println(marksScored);
		System.out.println("Integer array Size:" + size);
		System.out.println(indexValue);
		System.out.println(indexValue1);
		marksScored.clear();
		System.out.println(marksScored);

		Set<Double> percents = new HashSet<Double>();
		System.out.println("-----------Double values data--------");
		percents.add(80.55);
		percents.add(78.63);
		percents.add(79.55);
		percents.add(60.24);
		percents.add(50.24);
		percents.add(40.24);
		percents.add(20.24);
		percents.add(99.99);
		percents.add(88.88);
		percents.add(30.24);
		percents.add(59.24);
		percents.add(69.9);

		System.out.println(percents);

		System.out.println("Size of an Double array:" + percents.size());

		List<Float> temp = new ArrayList<Float>();
		temp.add((float) 12.4);
		temp.add((float) 10.4);
		temp.add((float) 15.4);
		temp.add((float) 16.4);
		temp.add((float) 18.4);
		temp.add((float) 52.4);

		temp.add((float) 82.4);

		System.out.println(temp);
		System.out.println("Size is:" + temp.size());

		List<Byte> ages = new LinkedList<Byte>();
		ages.add((byte) 21);
		ages.add((byte) 20);
		ages.add((byte) 22);
		ages.add((byte) 23);
		ages.add((byte) 24);
		ages.add((byte) 25);
		ages.add((byte) 26);
		ages.add((byte) 27);
		ages.add((byte) 28);
		ages.add((byte) 29);
		ages.add((byte) 30);
		ages.add((byte) 31);
		ages.add((byte) 31);
		ages.add((byte) 51);

		System.out.println(ages);
		System.out.println("Size is:" + ages.size());

		Set<Character> grades = new HashSet<Character>();
		grades.add('A');
		grades.add('B');
		grades.add('C');
		grades.add('D');
		grades.add('A');
		grades.add('B');
		grades.add('C');
		grades.add('D');
		grades.add('F');
		grades.add('G');
		grades.add('A');
		grades.add('C');
		grades.add('B');

		System.out.println(grades);

		System.out.println(grades.size());

		List<Short> regNos = new ArrayList<Short>();

		regNos.add((short) 8801);
		regNos.add((short) 8802);
		regNos.add((short) 8803);
		regNos.add((short) 8804);
		regNos.add((short) 8805);
		regNos.add((short) 8806);
		regNos.add((short) 8807);
		regNos.add((short) 8808);
		regNos.add((short) 8809);
		regNos.add((short) 88010);
		regNos.add((short) 88011);
		regNos.add((short) 88012);
		regNos.add((short) 88013);

		System.out.println(regNos);

		System.out.println(regNos.size());

		List<Boolean> pass = new LinkedList<Boolean>();
		pass.add(true);
		pass.add(false);
		pass.add(true);
		pass.add(false);
		pass.add(false);
		pass.add(false);
		pass.add(true);
		pass.add(true);
		pass.add(false);
		pass.add(false);
		pass.add(true);

		System.out.println(pass);

		System.out.println(pass.size());
		
		
		List<Long> phoneNos = new ArrayList<Long>();
//		phoneNos.add((long)4567898779);
		phoneNos.add((long)456789877);
		phoneNos.add((long)456789977);
		phoneNos.add((long)456789877);
		phoneNos.add((long)456789877);
		phoneNos.add((long)456789877);
		phoneNos.add((long)456789877);
		phoneNos.add((long)456789877);
		phoneNos.add((long)456789877);
		phoneNos.add((long)456789877);
		
		System.out.println(phoneNos);
		long index1=phoneNos.get(1);
		System.out.println(index1);

		System.out.println(phoneNos.size());

	}

}
