package com.xworkz.constructor.boot;

import com.xworkz.constructor.data.Image;

public class ImageRunner {
public static void main(String[] args) {
		
		Image ref=new Image();
		ref.show();
		ref=new Image("bhanu");
		ref.show();
		ref=new Image("bhanu","1/2/23");
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45");
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45",4567);
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45",4567,"Mobile");
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45",4567,"Mobile",77.5678f);
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45",4567,"Mobile",77.5678f,12.9876f);
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45",4567,"Mobile",77.5678f,12.9876f,"c:pictures");
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45",4567,"Mobile",77.5678f,12.9876f,"c:pictures",2.24f);
		ref.show();
		ref=new Image("bhanu","1/2/23","9:45",4567,"Mobile",77.5678f,12.9876f,"c:pictures",2.24f,"potrait");
		ref.show();
		


}
}
