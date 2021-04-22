package com.dcs.edu;
import java.util.Scanner;

public class SimpleCalculator {
			public static void main(String[] args) {
				System.out.println("....SIMPLE CALCULATOR....");
				 calculate();
			}
				public static void calculate() {
				Scanner scan =new Scanner(System.in);
			   
				try {
				System.out.println("Enter the first number");
				float firstNumber=scan.nextFloat();
				System.out.println("Enter the Second number");
				float secondNumber=scan.nextFloat();
				 System.out.println("Enter the operation \n 1)Addition  2) Subtraction  3)MUltiplication  4)Division");
				System.out.println("");
				int operator=scan.nextInt();
				float result;
				
			       switch(operator) {
					case 1: 
						result= firstNumber+secondNumber;
						System.out.println(firstNumber+" + "+ secondNumber +" = "+ result);
						perform();
						break;
					case 2:
						result = firstNumber-secondNumber;
						System.out.println(firstNumber+" - "+ secondNumber +" = "+ result);
						perform();
						break;
					case 3:
						result =firstNumber*secondNumber;
						System.out.println(firstNumber +" * "+ secondNumber+" = "+ result );
						perform();
						break;
					case 4:
						try {
							result = firstNumber/secondNumber;
						System.out.println(firstNumber+" / "+ secondNumber +" = "+ result);
						perform();
						break;
						}
						catch(Exception e) {
							System.out.println("Cannot divide by 0");
							perform();
							break;
						}
					                                                                                           
					default:
						System.out.println("Enter within the range");
						perform();
						break;
					}
				}
				catch(Exception e) {
					System.out.println("Enter a valid input");
					perform();
					}
			}
				
			        public static void perform() {
			        	try {
						Scanner sc=new Scanner(System.in);
						System.out.println("Do you want to continue \n Press 1 to continue and  0 to stop");
						int n=sc.nextInt();			
					if(n==1) {
						calculate();
					}else if(n==0) {
						System.out.println("Bye");
					}else {
						System.out.println("enter within the range");
						perform();
					}
			        	}
						
			        	catch(Exception e) {
			        		System.out.println("Enter a valid input");
			        		perform();
			        	
			        	}}
					}

			







