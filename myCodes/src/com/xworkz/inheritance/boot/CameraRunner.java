package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.data.Camera;

import com.xworkz.inheritance.data.Device;
public class CameraRunner {
	public static void main(String args[])
	{
		Camera camera=new Camera();
		camera.capture("sony");
		
		Device device=new Device();
		device.camDevice();
		
		Camera camera2=new Camera("Sony");
		String cam=camera2.getName();
		System.out.println("Camera name is:"+cam);
		
		Camera cam1=(Camera)device;
		cam1.capture("sony");
		
		
		
		
		
		}

}
