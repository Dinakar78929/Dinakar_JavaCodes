package com.xworkz.association.data;

public class Wallet {
	public String brand;
	public String material;
	public int price;
	public Card card;
	
	public Wallet()
	{
		
	}

	public Wallet(String brand, String material, int price) {
		this.brand = brand;
		this.material = material;
		this.price = price;
	}
	public void init(String brand, String material, int price) {
		this.brand = brand;
		this.material = material;
		this.price = price;
	}
	public void init(Card card)
	{
		this.card=card;
	}
	public void show()
	{
		System.out.println("Wallet details are:");
		System.out.println("wallet brand:"+brand);
		System.out.println("material used:"+material);
		System.out.println("price"+price);
		if(this.card!=null) {
			this.card.showCard();
	}
	else
	{
		System.err.println("this.card is not pointing to card");
		
	}

	

}
}
