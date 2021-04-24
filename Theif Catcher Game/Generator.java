package theif;

import java.util.Random;

public class Generator {

		Random r=new Random();
		Admin a=new Admin();
		
		static int Thief;
		String charecters="KQPT";
		public void gen() {
			//random generation of card Details
			a.cardDetail1=charecters.charAt(r.nextInt(charecters.length()));
			
			a.cardDetail2=charecters.charAt(r.nextInt(charecters.length()));
			while(a.cardDetail1==a.cardDetail2) {
				a.cardDetail2=charecters.charAt(r.nextInt(charecters.length()));
			}
			
			a.cardDetail3=charecters.charAt(r.nextInt(charecters.length()));
			while(a.cardDetail1==a.cardDetail3||a.cardDetail2==a.cardDetail3) {
				a.cardDetail3=charecters.charAt(r.nextInt(charecters.length()));
			}
			
			a.cardDetail4=charecters.charAt(r.nextInt(charecters.length()));
			while(a.cardDetail1==a.cardDetail4||a.cardDetail2==a.cardDetail4||a.cardDetail3==a.cardDetail4) {
				a.cardDetail4=charecters.charAt(r.nextInt(charecters.length()));
			}
			
			
			//Assign the Thief Card Number to Theif variable
			if(a.cardDetail1=='T') {
				Thief=1;
			}
			else if(a.cardDetail2=='T') {
				Thief=2;
			}
			else if(a.cardDetail3=='T') {
				Thief=3;
			}
			else {
				Thief=4;
			}
		}
	}


