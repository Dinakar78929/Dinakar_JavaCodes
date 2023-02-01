package com.xworkz.constructor.data;

public class Image {
	String name;
	String date;
	String time;
	int pixel;
	String device;
	float locationLangitude;
	float locationLatitude;
	String savePath;
	float size;
	String type;
	
	public Image()
	{
		
	}
	public Image(String nm)
	{
		name=nm;
	}
	public Image(String nm,String dt)
	{
		name=nm;
		date=dt;
	}
	public Image(String nm,String dt,String tm)
	{
		name=nm;
		date=dt;
		time=tm;
	}
	public Image(String nm,String dt,String tm,int pxl)
	{
		name=nm;
		date=dt;
		time=tm;
		pixel=pxl;
	}
	public Image(String nm,String dt,String tm,int pxl,String dvc)
	{
		name=nm;
		date=dt;
		time=tm;
		pixel=pxl;
		device=dvc;
	}
	public Image(String nm,String dt,String tm,int pxl,String dvc,float locationLang)
	{
		name=nm;
		date=dt;
		time=tm;
		pixel=pxl;
		device=dvc;
		locationLangitude=locationLang;
	}
	public Image(String nm,String dt,String tm,int pxl,String dvc,float locationLang,float locationLati)
	{
		name=nm;
		date=dt;
		time=tm;
		pixel=pxl;
		device=dvc;
		locationLangitude=locationLang;
		locationLatitude=locationLati;
	}
	public Image(String nm,String dt,String tm,int pxl,String dvc,float locationLang,float locationLati,String sp)
	{
		name=nm;
		date=dt;
		time=tm;
		pixel=pxl;
		device=dvc;
		locationLangitude=locationLang;
		locationLatitude=locationLati;
		savePath=sp;
	}
	public Image(String nm,String dt,String tm,int pxl,String dvc,float locationLang,float locationLati,String sp,float sz)
	{
		name=nm;
		date=dt;
		time=tm;
		pixel=pxl;
		device=dvc;
		locationLangitude=locationLang;
		locationLatitude=locationLati;
		savePath=sp;
		size=sz;
	}
	public Image(String nm,String dt,String tm,int pxl,String dvc,float locationLang,float locationLati,String sp,float sz,String typ)
	{
		name=nm;
		date=dt;
		time=tm;
		pixel=pxl;
		device=dvc;
		locationLangitude=locationLang;
		locationLatitude=locationLati;
		savePath=sp;
		size=sz;
		type=typ;
	}
	public void show() {
	System.out.println("---------Image details start-------------- ");
	System.out.println(" Image name is:"+name);
	System.out.println("Image capture date:"+date);
	System.out.println("Image capture time::"+time);
	System.out.println("Image pixel:"+pixel);
	System.out.println("Image capture device:"+device);
	System.out.println("Image location in langitude:"+locationLangitude);
	System.out.println("Image location in latitude:"+locationLatitude);
	System.out.println("Image path "+savePath);
	System.out.println("Image size: "+size);
	System.out.println("Image type: "+type);
	System.out.println("---------Image details end-------------- ");
	}

}
