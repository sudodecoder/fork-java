import java.util.Scanner;
class Calculate {
	public static void main(String[] args) {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of a rectangle");
		double l=scan.nextDouble();
		System.out.println("Enter the breadth of a rectangle");
		double b=scan.nextDouble();
		Rectangle r=new Rectangle(l,b);
		r.area();
		r.perimeter();
		
		System.out.println("Enter the side of a Square");
		double side=scan.nextDouble();
		Square s=new Square(side);
		s.area();
		s.perimeter();
		
	}
		catch(Exception e) {
			System.out.println("Enter the valid input");
		}
}
}