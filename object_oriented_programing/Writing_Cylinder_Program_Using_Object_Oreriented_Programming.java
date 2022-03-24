package object_oriented_programing;
import java.util.Scanner;
class Cylinder{
	public double radius;
	public double height;
	public double lidArea() {
		return Math.PI*radius*radius;
	}
	public double totalsurfaceArea() {
		return 2*lidArea()+circumference()*height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
}
public class Writing_Cylinder_Program_Using_Object_Oreriented_Programming {
          public static void main(String args []) {
        	  Scanner sc = new Scanner(System.in);
        	  Cylinder c1 = new Cylinder();
        	  c1.radius = sc.nextDouble();
        	  c1.height = sc.nextDouble();
        	  System.out.println("lid Area od a Cylinder is = "+ c1.lidArea());
        	  System.out.println("Surface Area of Cylinder is = "+ c1.totalsurfaceArea());
        	  System.out.println("Volume of Cylinder is =" + c1.volume());
        	  System.out.println("Circumference of  a Cylinder is = "+ c1.circumference());
        	  
        	  
          }
}
