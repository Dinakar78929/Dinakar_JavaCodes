package com.xworkz.association.dtoRunner;
import com.xworkz.association.dto.TravelDTO;
public class TravelDTORunner {

	public static void main(String[] args) {
		TravelDTO travel =new TravelDTO();
		travel.setPlaceName("Kodaikanal");
		travel.setDistance(400);
		travel.setTravelDuration(6);
		travel.setVehical("car");
		travel.setTravelDate(null);
		
		System.out.println(travel);
		System.out.println(travel.equals(travel));
		System.out.println("hashCode:"+travel.hashCode()+" "+ "oroginalhashCode:"+System.identityHashCode(travel));
	}

}
