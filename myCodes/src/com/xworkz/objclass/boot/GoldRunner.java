package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.Gold;
public class GoldRunner {

	public static void main(String[] args) {
		Object gold=new Gold();
		System.out.println(gold);
		
		Gold gold1=new Gold();
		gold1.setName("KDM");
		gold1.setPrice(25000);
		gold1.setGrams(5D);
		gold1.isOriginal(true);
		System.out.println(gold1);
		
		Gold gold2=new Gold();
		gold2.setName("24karot");
		gold2.setPrice(60000);
		gold2.setGrams(10D);
		gold2.isOriginal(true);
		System.out.println(gold2);
		
		System.out.println(gold1.equals(gold2));
		
		}

}
