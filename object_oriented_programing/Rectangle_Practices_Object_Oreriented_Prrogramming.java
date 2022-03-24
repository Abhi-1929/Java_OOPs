package object_oriented_programing;
import java.util.Scanner;
class Rectangle {
	public double length;
    public double breadth;
    public double  area() {
    	return breadth*length;
    }
    public double  perimeter() {
    	return 2*(length+breadth);
    }
    public boolean isSquare() {
    	if(length==breadth)
    		
    		return true;
    	else
    		return false;
    }
}
public class Rectangle_Practices_Object_Oreriented_Prrogramming {
           public static void main(String args[]) {
        	   Scanner sc = new Scanner(System.in);
        	   Rectangle r1 = new Rectangle();
        	   r1.length= sc.nextDouble();
        	   r1.breadth = sc.nextDouble();
        	   System.out.println( "The Area is  = "+ r1.area());
        	   System.out.println("The Perimeter is = "+ r1.perimeter());
        	   System.out.println( "Is it a Square = "+r1.isSquare());
        	   
           }
}
