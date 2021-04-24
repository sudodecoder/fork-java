package com.dcs.edu;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	try{System.out.println("Enter the number");
	int num=scan.nextInt();
	int temp=num;
			int res=0,a;
			while(num>0) {
				a=num%10;
				num=num/10;
				res=res+(a*a*a*a);
		                     }
			if(temp==res) {
				System.out.println("It is an ArmStrong Number");
			}
			else {
				System.out.println("It is not an Armstrong Number");
			}
	}
	catch(Exception e) {
		System.out.println("Enter a valid input");
	}
	}
}
