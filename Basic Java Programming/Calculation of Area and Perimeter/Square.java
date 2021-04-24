package com.dcs.edu;

public class Square extends Rectangle{
	double size;
Square(double size){
	super(size,size);
	this.size=size;
}
public void calculateArea() {
	double area=size*size;
	System.out.println("Area of a Sqaure = "+area);
}
public void calculatePerimeter() {
	double perimeter=4*size;
			System.out.println("Perimeter of a Sqaure = "+perimeter);
}

}
