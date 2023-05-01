package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure2.SpringConfigure2;
import com.xworkz.spring.thing2.Mouse;


public class ComponentRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfigure2.class);
		System.out.println("No of bean :"+spring.getBeanDefinitionCount());
		
		Mouse ref= spring.getBean(Mouse.class);
		System.out.println(ref);
		ref.name();
//		System.out.println(ref.name());
	}

}
