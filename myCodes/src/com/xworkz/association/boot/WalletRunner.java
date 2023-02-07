package com.xworkz.association.boot;
import com.xworkz.association.data.Wallet;
import com.xworkz.association.data.Card;

public class WalletRunner {

	public static void main(String[] args) {
		System.out.println("inside main");
		Wallet wallet=new Wallet("titan","leather",1500);
		wallet.show();
		Card card=new Card(987654567,"SBI",123);
		wallet.init(card);
		wallet.show();
		
		System.out.println("outside main");
		

	}

}
