package object_oriented_programing;
import java.util.Scanner;
class Student{
	public int rollNo;
	public String name;
	public String course;
	public int m1 ,m2 ,m3;
	public int  total() {
		return m1+m2+m3;
	}
	public int average() {
		return total()/3;
	}
	public void grade() {
		if(average()>=80) {
		    System.out.println("A");
		}
		else if(average()>=70 && average()<80) {
			System.out.println("Your Grade is = B");
		}
		else if(average()>=60 && average()<70) {
			System.out.println("Your Grade is = C");
		}
		else if(average()>=45 && average()<60) {
			System.out.println("Your Grade is = D");
		}
		else
			System.out.println("Your Grade is = F");
		
	}
}
public class Writing_A_Class_For_Student_Using_Obeject_Oriented_Programming {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 Student s1 = new Student();
    	 Student s2 = new Student();
    	   s1.name = "Abhishek";
    	   s1.rollNo = 31;
    	   s1.course= "Science";
    	   s1.m1= sc.nextInt();
    	   s1.m2 = sc.nextInt();
    	   s1.m3 = sc.nextInt();
    	   System.out.println("Name = "+s1.name);
    	   System.out.println("Roll no = "+s1.rollNo);
    	   System.out.println("The Total Marks are = " +s1.total() );
    	   System.out.println("The Average Marks are = "+ s1.average());
    	   s1.grade();
    	   System.out.println("");
    	   s2.name = "Nikhil";
    	   s2.rollNo = 22;
    	   s2.course = "Commerse";
    	   s2.m1= sc.nextInt();
    	   s2.m2 = sc.nextInt();
    	   s2.m3 = sc.nextInt();
    	   System.out.println(s2.name);
    	   System.out.println(s2.rollNo);
    	   System.out.println("The Total Marks are = " +s2.total() );
    	   System.out.println("The Average Marks are = "+ s2.average());
    	   s2.grade();
     }
}
