package com.dcs.edu;

public class Rectangle {
double length;
double breadth;
Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
}
		public void area() {
			double area=length*breadth;
			System.out.println("Area of a Rectangle = " +area);
		
	}
		public void perimeter() {
			double perimeter=2*(length+breadth);
			System.out.println("Perimeter of a Rectangle = " +perimeter);
		}
}
class Square extends Rectangle{
	double s;
Square(double s){
	super(s,s);
	this.s=s;
}
public void area() {
	double area=s*s;
	System.out.println("Area of a Sqaure = "+area);
}
public void perimeter() {
	double perimeter=4*s;
			System.out.println("Perimeter of a Sqaure = "+perimeter);
			
}
}
