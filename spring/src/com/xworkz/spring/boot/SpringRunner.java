package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.SpringConfigure;

public class SpringRunner {
	
	public static void main(String[] args) {
	
		ApplicationContext  context= new AnnotationConfigApplicationContext(SpringConfigure.class);
		
		
	}

	
}
