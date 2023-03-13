package com.xworkz.association.dtoRunner;
import com.xworkz.association.dto.MarketDTO;
public class MarketDTORunner {

	public static void main(String[] args) {
		MarketDTO market=new MarketDTO();
		market.setName("Chindi Market");
		market.setArea("PrakashNagar");
		market.setSquareFeet(100);
		market.setHoliday("Tuesday");
		
		System.out.println(market);
		System.out.println(market.equals(market));
		System.out.println("hashCode:"+market.hashCode()+" "+ "oroginalhashCode:"+System.identityHashCode(market));
	}

}
