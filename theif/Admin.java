package theif;

import java.util.Scanner;


public class Admin {
		Generator g;
		Admin a;
		char cardDetail1,cardDetail2,cardDetail3,cardDetail4;
		String player1,player2,player3,player4;
		char player1cardNo,player2cardNo,player3cardNo,player4cardNo;
		char acp1,acp2,acp3,acp4;
		Scanner scan=new Scanner(System.in);
		
		public void run() {
			//to use the same object of Generator class.
			g=new Generator();
			g.gen();
			a=g.a;
			
			
			//enrolling player name
					System.out.println("Enter the Player 1 name:");
					player1=scan.nextLine();
					System.out.println("Enter the Player 2 name:");
					player2=scan.nextLine();
					System.out.println("Enter the Player 3 name:");
					player3=scan.nextLine();
					System.out.println("Enter the Player 4 name:");
					player4=scan.nextLine();
					
					
					
					//Assign the card details to player's
			System.out.println(player1+" please select your card number");
			player1cardNo=scan.next().charAt(0);
			while(!(player1cardNo>'0' && player1cardNo<'5')) {
				System.out.println(player1+" please enter the card Number between the Range of {1-4}");
				player1cardNo=scan.next().charAt(0);
			}
			acp1=assign(player1cardNo);
			
			
			//Assign the card details for person2
			System.out.println(player2+" please select your card number");
			player2cardNo=scan.next().charAt(0);
			
			while(!(player2cardNo>'0' && player2cardNo<'5')) {
				System.out.println(player2+" please enter the card Number between the Range of {1-4}");
				player2cardNo=scan.next().charAt(0);
			}
			
			while(player2cardNo==player1cardNo) {
				System.out.println("Card already choosen \nplease enter different card Number within a range {1-4}");
				player2cardNo=scan.next().charAt(0);
				
				while(!(player2cardNo>'0' && player2cardNo<'5')) {
					System.out.println(player2+" please enter the card Number between the Range of {1-4}");
					player2cardNo=scan.next().charAt(0);
				}	
			}
			acp2=assign(player2cardNo);
			
			//Assign the card details for person3
			
			System.out.println(player3+" please select your card number");
			player3cardNo=scan.next().charAt(0);
			
			while(!(player3cardNo>'0' && player3cardNo<'5')) {
				System.out.println(player3+" please enter the card Number between the Range of {1-4}");
				player3cardNo=scan.next().charAt(0);
			}
			
			while(player3cardNo==player1cardNo||player2cardNo==player3cardNo) {
				System.out.println("Card already choosen \nplease enter different card Number within a range {1-4}");
				player3cardNo=scan.next().charAt(0);
				
				while(!(player3cardNo>'0' && player3cardNo<'5')) {
					System.out.println(player3+" please enter the card Number between the Range of {1-4}");
					player3cardNo=scan.next().charAt(0);
				}	
			}
			acp3=assign(player3cardNo);
			
			//Assign the card details for person4
			
			System.out.println(player4+" please select your card number");
			player4cardNo=scan.next().charAt(0);
			
			while(!(player4cardNo>'0' && player4cardNo<'5')) {
				System.out.println(player4+" please enter the card Number between the Range of {1-4}");
				player4cardNo=scan.next().charAt(0);
			}
			
			while(player4cardNo==player1cardNo||player4cardNo==player2cardNo||player4cardNo==player3cardNo) {
				System.out.println("Card already choosen \nplease enter different card Number within a range {1-4}");
				player4cardNo=scan.next().charAt(0);
				
				while(!(player4cardNo>'0' && player4cardNo<'5')) {
					System.out.println(player4+" please enter the card Number between the Range of {1-4}");
					player4cardNo=scan.next().charAt(0);
				}	
			}
			acp4=assign(player4cardNo);
			check();
		}
		
		public char assign(char element) {
			if(element=='1')
				return a.cardDetail1;
			 else if(element=='2')
				return a.cardDetail2;
				else if(element=='3')
					return a.cardDetail3;
					else return a.cardDetail4;
		}
		
		public void check() {
			if(acp1=='P') {
				Police p=new Police();
				p.search(player1);
			}
			else if(acp2=='P') {
				Police p=new Police();
				p.search(player2);
			}
			else if(acp3=='P') {
				Police p=new Police();
				p.search(player3);
			}
			else {
				Police p=new Police();
				p.search(player4);
			}
		}
	}



