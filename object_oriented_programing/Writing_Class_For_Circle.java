package object_oriented_programing;
// Name:- Abhishek Ashutosh Khairnar;
class Circle {
	public double radius ; // property
	public double area() { //Method
		return Math.PI*radius*radius;
	}
	public double perimeter() { // Method
		return 2*Math.PI*radius;
	}
	public double circumference() { //Method
		return perimeter();
	}
}
public class Writing_Class_For_Circle{
 public static void main(String args[]) {
	 Circle c1 = new Circle();
	 Circle c2 = new Circle();
	 c1.radius = 7; // Calling Property;
	 c2.radius = 14;
	 System.out.println(" Area is = "+c1.area());
	 System.out.println( "Circumference is = "+ c1.circumference());
	 System.out.println( " Perimeter is = "+c1.perimeter());
      System.out.println("");
	 System.out.println(" Area_2 is = "+c2.area());
	 System.out.println( "Circumference_2 is = "+ c2.circumference());
	 System.out.println( " Perimeter_2 is = "+c2.perimeter());
}
}