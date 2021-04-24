package com.dcs.edu;

public class Rectangle {
double length;
double breadth;
Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
}
		public void calculateArea() {
			double area=length*breadth;
			System.out.println("Area of a Rectangle = " +area);
		
	}
		public void calculatePerimeter() {
			double perimeter=2*(length+breadth);
			System.out.println("Perimeter of a Rectangle = " +perimeter);
		}

}
