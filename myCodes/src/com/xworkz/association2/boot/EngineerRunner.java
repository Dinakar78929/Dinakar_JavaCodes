package com.xworkz.association2.boot;

import com.xworkz.associaion2.data.Engineer;
import com.xworkz.associaion2.data.Degree;

public class EngineerRunner {
public static void main(String args[]) {
		
		Engineer engineer=new Engineer();
		engineer.setName("Sumith");
		engineer.setSalary(25000);
		String[] skl={"fast typing","easy learning","solution finding"};
		engineer.setSkills(skl);
		engineer.display();
		
		
	
		Degree degree1=new Degree();
		Degree degree2=new Degree();
		 degree1.setName("BCA");
		 degree1.setDuration(3);
		 degree1.setPursuing(true);
		 degree1.setPercentage(69.78D);
		 degree1.setBranch("CS");
		
			degree2.setName("Bcom");
			 degree2.setDuration(3);
			 degree2.setPursuing(true);
			 degree2.setPercentage(70.78D);
			 degree2.setBranch("bcom");
			 
			 Degree[] degrees= {degree1,degree2};
			
		
		engineer.setDegree(degrees);
		engineer.display();

}
}

