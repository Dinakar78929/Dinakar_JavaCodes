package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class EmailRunner {

	public static void main(String[] args) {

		Collection<String> emails = new ArrayList<String>();
		emails.add("dinakar@gmail.com");
		emails.add("jayanth@gmail.com");
		emails.add("kavana@gmail.com");
		emails.add("divya@gmail.com");
		emails.add("nikhil@gmail.com");
		emails.add("jhon@yahoo.com");
		emails.add("mark@yahoo.com");
		emails.add("max@yahoo.com");
		emails.add("tailor@yahoo.com");
		emails.add("seena@yahoo.com");
		emails.add("raki@outlook.com");
		emails.add("basu@outlook.com");
		emails.add("shivu@outlook.com");
		emails.add("annesh@outlook.com");
		emails.add("sankya@outlook.com");
		emails.add("pavan@xworkz.com");
		emails.add("krish@xworkz.com");
		emails.add("krishna@xworkz.com");
		emails.add("shubha@xworkz.com");
		emails.add("akshata@xworkz.com");
		emails.add("anitha@xworkz.com");
		emails.add("savitri@xworkz.com");
		emails.add("ankitha@xworkz.com");
		emails.add("kavan@xworkz.com");
		emails.add("kohli@xworkz.com");

		System.out.println("---------Converting all e mails into uppercase-------");
		Collection<String> convertedEmail = new ArrayList<String>();
		for (String string : emails) {
			System.out.println(string.toUpperCase());
			convertedEmail.add(string);
		}

		System.out.println("--------printning only gmails------");
		emails.stream().filter(ref -> ref.matches(".*gmail\\.com")).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

//		System.out.println("--------printning only xworkz mails------");
//		emails.stream().filter(ref -> ref.endsWith("@xworkz.com")).collect(Collectors.toList())
//				.forEach(element -> System.out.println(element));
		System.out.println("--------printning only xworkz mails------");
		emails.stream().filter(ref -> ref.matches(".*xworkz\\.com")).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
		
//		System.out.println("----------printning email which is not @gmail and @xworkz--------- ");
//		emails.stream().filter(ref -> !ref.endsWith("@xworkz.com") && !ref.endsWith("@gmail.com"))
//				.collect(Collectors.toList()).forEach(element -> System.out.println(element));
		
		System.out.println("----------printning email which is not @gmail and @xworkz--------- ");
		emails.stream().filter(ref -> !ref.matches(".*xworkz\\.com") && !ref.matches(".*gmail\\.com")).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

		System.out.println("----------printning email with unique domain--------- ");
		emails.stream().map(ref->ref.split("@")[1]).distinct().collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
		
		System.out.println("----------printning email without domain--------- ");
		emails.stream().map(ref->ref.split("@")[0]).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
		
		
	}

}
