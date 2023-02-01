package com.xworkz.constructor.boot;

import com.xworkz.constructor.data.Train;

public class TrainRunner {
		public static void main(String[] args) {
			
		Train ref=new Train();
			ref.show();
			 ref=new Train("JAN Shatabdi");
				ref.show();
				 ref=new Train("JAN Shatabdi",277276);
					ref.show();
					 ref=new Train("JAN Shatabdi",277276,25);
						ref.show();
						 ref=new Train("JAN Shatabdi",277276,25,'A');
							ref.show();
							 ref=new Train("JAN Shatabdi",277276,25,'A',90);
								ref.show();
								 ref=new Train("JAN Shatabdi",277276,25,'A',90,"5:44");
									ref.show();
									 ref=new Train("JAN Shatabdi",277276,25,'A',90,"5:44",2);
										ref.show();
										 ref=new Train("JAN Shatabdi",277276,25,'A',90,"5:44",2,"A/C");
											ref.show();

}
}
