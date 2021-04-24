package com.dcs.edu;

import java.util.Scanner;

public class Account {
	double balanceAmount=0;
	double totalAmount=20000;
	public void debit() {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount to be debited");
		double debitAmount=scan.nextDouble();
		if(debitAmount>totalAmount) {
			System.out.println("The Account balance : "+totalAmount);
			System.out.println("Debit amount exceeded account balance");
		}
		else {
		balanceAmount=totalAmount-debitAmount;
		System.out.println("The amount debited : "+debitAmount);
		System.out.println("The Remaining Account Balance : "+balanceAmount);
	         }
		}
		catch(Exception e) {
			System.out.println("Enter the valid amount");
			debit();
		}
	}
}
