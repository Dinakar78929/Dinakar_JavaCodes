package com.xworkz.constructor.boot;

import com.xworkz.constructor.data.Message;

public class MessageRunner {
		public static void main(String[] args) {
			
			Message ref=new Message();
			ref.show();
			ref=new Message("Divya");
			ref.show();
			ref=new Message("Divya",7892966782L);
			ref.show();
			ref=new Message("Divya",7892966782L,"10:45");
			ref.show();
			ref=new Message("Divya",7892966782L,"10:45","12/01/2023");
			ref.show();
			ref=new Message("Divya",7892966782L,"10:45","12/01/2023","hai gm");
			ref.show();
}

}

