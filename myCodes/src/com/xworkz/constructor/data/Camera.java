package com.xworkz.constructor.data;

public class Camera {
	public String zoom; 
	public int imageSensor;
	public int shutterSpeed;
	public boolean video;
	public int resolution;
	
	public Camera(String zoom, int imageSensor, int shutterSpeed, boolean video, int resolution) {
		this.zoom = zoom;
		this.imageSensor = imageSensor;
		this.shutterSpeed = shutterSpeed;
		this.video = video;
		this.resolution = resolution;
	}
	public void showCamera() {
		System.out.println("\n-----------");
		System.out.println("class camera details:");
		System.out.println("zoom capability: " + zoom );
		System.out.println("Image sensor size: " + imageSensor);
		System.out.println("Shutter speed: " + shutterSpeed);
		System.out.println("Video recording capability:"+video);
		System.out.println("resolution:"+resolution);
	}


}
