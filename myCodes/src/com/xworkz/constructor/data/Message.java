package com.xworkz.constructor.data;

public class Message {
String contactName;
long number;
String time;
String date;
String content;
public  Message() 
{
	
}
public  Message(String cn) 
{
	contactName=cn;
}
public  Message(String cn,long num) 
{
	contactName=cn;
	number=num;
}
public  Message(String cn,long num,String tm) 
{
	contactName=cn;
	number=num;
	time=tm;
}
public  Message(String cn,long num,String tm,String dt) 
{
	contactName=cn;
	number=num;
	time=tm;
	date=dt;
	
}
public  Message(String cn,long num,String tm,String dt,String cnt) 
{
	contactName=cn;
	number=num;
	time=tm;
	date=dt;
	content=cnt;
	
	
}
public void show() {
	System.out.println("--------------details of message---------");
	System.out.println("contact name is:"+contactName);
	System.out.println("contact number is:"+number);
	System.out.println("message recived time is:"+time);
	System.out.println("message recived date is:"+date);
	System.out.println("message content is:"+content);
	System.out.println("-------------- end of details  message---------");
}

}
