package com.xworkz.association.data;

public class Card {
	public long  cardNo;
	public String company;
	public int cvv;
	
	public Card()
	{
		
	}

	public Card(long cardNo, String company, int cvv) {
		this.cardNo = cardNo;
		this.company = company;
		this.cvv = cvv;
	}
	
	public void showCard()
	{
		System.out.println("card number:"+cardNo);
		System.out.println("card company:"+company);
		System.out.println("cvv no:"+cvv);
		
	}

}
