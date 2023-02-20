package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.Pipe;
public class PipeRunner {

	public static void main(String[] args) {
		Object pipe=new Pipe();
		System.out.println(pipe);
	
		
		Pipe pipe2=new Pipe();
		pipe2.setName("pilips");
		pipe2.setLength(10.5D);
		pipe2.setDiameter(3D);
		pipe2.setPrice(100);
		System.out.println(pipe2);
		System.out.println("Pipe2 hashcode:"+pipe2.hashCode());	
	
		
		Pipe pipe3=new Pipe();
		pipe2.setName("PVC");
		pipe2.setLength(20.5D);
		pipe2.setDiameter(2D);
		pipe2.setPrice(200);
		System.out.println(pipe3);
		System.out.println("Pipe2 hashcode:"+pipe3.hashCode());	
		
		System.out.println(pipe2.equals(pipe3));

	}

}

