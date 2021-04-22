package com.dcs.edu;

public class Employee {
	String name,address;
	int yearOfJoining;
	double salary;
	
	public void insert(String n,int i,double s,String a) {
		yearOfJoining=i;
		name=n;
		address=a;
		salary=s;
	}
	public void display() {
		System.out.println(name+ " \t\t "+yearOfJoining+ "\t\t"+salary+ "\t\t"+address);
	}
	static class test{
		public static void main(String[] args) {
			Employee e1=new Employee();
			Employee e2=new Employee();
			Employee e3=new Employee();
			e1.insert("Robert", 1994, 12000, "64C-WallsStreat");
			e2.insert("Samm",    2000, 15000, "68D-WallsStreat");
			e3.insert("John",   1999, 15000, "26B-WallsStreat");
			System.out.println("Name \t Year of joining\tSalary\t\tAddress");
			e1.display();
			e2.display();
			e3.display();
		}
	}
	}
	


