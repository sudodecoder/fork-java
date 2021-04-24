package theif;
import java.util.Scanner;

public class Police {

	

	
		public void search(String name) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Mr/Ms "+name+" became the Police\n"
					+ "please catch the thief by guessing the card number");
			int card=scan.nextInt();
			if(card==Generator.Thief) {
				System.out.println("Congragulation "+name+" you win successfull catched the Thief ");
			}
			else {
				System.out.println("Game Lost!!!");
			}
		}
	}


