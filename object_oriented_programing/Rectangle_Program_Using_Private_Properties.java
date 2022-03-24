package object_oriented_programing;
class Rectangle02{
	private double length;
	private double breadth;
	public double getlength() {
		return length;
	}
	public double getbreadth() {
		return breadth;
	}
	public void setlength(double l) {
		length = l;
	}
	public void setbreadth(double b) {
		breadth = b;
	}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	public boolean Isquare() {
		if(length == breadth)
			return true;
		else
			return false;
	}
}
public class Rectangle_Program_Using_Private_Properties {
       public static void main(String args[]) {
    	   Rectangle02 r = new Rectangle02();
    	   r.setlength(10.5);
    	   r.setbreadth(5);
    	   System.out.println("Area is = " +r.area());
    	   System.out.println("Perimeter is = "+ r.perimeter());
    	   System.out.println("Is it a Square = "+ r.Isquare());
    	   System.out.println("Length is = "+r.getlength());
    	   System.out.println("Breadth is = "+ r.getbreadth());
       }
}
