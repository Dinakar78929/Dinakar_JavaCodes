package com.xworkz.spring.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.MallConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(MallConfiguration.class);
		System.out.println("No of bean :"+spring.getBeanDefinitionCount());
//		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);
		
		MallConfiguration bean=spring.getBean(MallConfiguration.class);
		System.out.println("Mall Name:"+bean.mallName());
		System.out.println("Mall Name:"+bean.mallOwner());
		System.out.println("Mall Name:"+bean.mallLocation());
		System.out.println("Mall Name:"+bean.mallFloor());
		System.out.println("Mall Name:"+bean.mallEngineer());
		System.out.println("Mall Name:"+bean.mallColor());
		System.out.println("Mall Name:"+bean.mallInfrastructure());
		System.out.println("Mall Name:"+bean.mallGameCenter());
		System.out.println("Mall Name:"+bean.mallFoodCenter());
		System.out.println("Mall Name:"+bean.mallHyperMarket());
	}

}
