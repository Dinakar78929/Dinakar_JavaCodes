package com.xworkz.association.dtoRunner;
import com.xworkz.association.dto.ApplicationDTO;
import java.time.LocalDate;

public class ApplicationDTORunner {
	public static void main(String args[])
	{
		ApplicationDTO application=new ApplicationDTO();
		application.setName("Facebook");
		application.setSize(200);
		application.setVersion(2.6);
		application.setDevelopedBy("Darshan");
//		application.setCreatedDate(2010-6-1);
		
		
		System.out.println(application.equals((application)));
		System.out.println(application);
		
		System.out.println("HashCode:"+application.hashCode()+" "+"OriginalHashCode:"+System.identityHashCode(application));
	}
//	application.setName("Kishan");
	

}
