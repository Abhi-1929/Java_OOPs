package object_oriented_programing;
// Name : Abhishek Ashutosh Khairnar;
import java.util.Scanner;
class CarInfo{
	public String name;
    public String Brand;
    public String Chassis;
     public int  Yearused;
     public void TurnOn() {
    	 System.out.println("Vehicle is Started :) ");
     }
     public void Turnoff() {
    	 System.out.println("Vehicle is Turned OFF :) ");
     }
     public void  CheckingOfVehicle() {
    	 
    	 if (Yearused>=10) {
    		 System.out.println("old vehicle");
    	 }else {
    		 System.out.println("New vehicle");
    	 } 
     }
}
public class Car_Progam_Practice_With_Help_Of_Object_Oriented_Programming {
      public static void main(String args[]) {
    	  CarInfo c1 = new CarInfo();
    	  CarInfo c2 = new CarInfo();
    	  c1.name = "Venu";
    	  c1.Brand = "Hyndai";
    	  c1.Chassis = "1FV3EFAC7TL676933";
    	  c1.Yearused= 2;
    	  System.out.println("Name = "+c1.name);
    	  System.out.println("Brand = "+c1.Brand);
    	  System.out.println("Chassis Number = "+c1.Chassis);
    	  System.out.println("Years used = "+c1.Yearused + " Years");
    	 c1.TurnOn();
    	 c1.Turnoff();
    	 c1.CheckingOfVehicle();
    	 System.out.println("");
    	 c2.name = "i20";
   	     c2.Brand = "Hyndai";
   	     c2.Chassis = "1G8ZH528X2Z310309";
   	     c2.Yearused= 12;
   	     System.out.println("Name = "+c2.name);
   	     System.out.println("Brand = "+c2.Brand);
   	     System.out.println("Chassis Number = "+c2.Chassis);
   	     System.out.println("Years used = "+c2.Yearused + " Years");
   	     c2.TurnOn();
   	     c2.Turnoff();
   	     c2.CheckingOfVehicle(); 
      }
}
