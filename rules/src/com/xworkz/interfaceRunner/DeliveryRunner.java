package com.xworkz.interfaceRunner;
import com.xworkz.interfaces.Delivery;
import com.xworkz.interfaces.impl.Dunzo;
import com.xworkz.interfaces.usage.Person;
public class DeliveryRunner {

	public static void main(String[] args) {

		Delivery delivery=new Dunzo();
		
		Person person=new Person(delivery);
		person.checkDelivery();
		

	}

}
