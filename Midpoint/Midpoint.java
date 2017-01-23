// Janelynn Camingue
// Midpoint.java
// 1/17/17
// The program asks the user to input two points of a line and calculates the midpoint of an equation

import java.util.Scanner;

class Midpoint{
   public static void main( String[] args){
        
      int x1, x2, y1, y2, midpt1, midpt2;
      Scanner sc = new Scanner (System.in);
     
     // Asks the user for the 2 points needed to find the midpoint and then prints it out to show the user what they
	 // typed in as a whole

	 // Asks for 1st point
      System.out.println("First point");
	  System.out.print("X(1) is: ");
      x1 = sc.nextInt();
	  System.out.print("Y(1) is: ");
	  y1 = sc.nextInt();
	  
	 // Asks for 2nd point 
	  System.out.println("Second point");
	  System.out.print("X(2) is: ");
      x2 = sc.nextInt();
	  System.out.print("X(2) is: ");
      y2 = sc.nextInt();
	  
	 // inputs by the user put together for clarity
	  System.out.println("The first point is (" +x1+"," +y1+")");
	  System.out.println("The second point is (" +x2+"," +y2+")");
	  
     // formula for calculating the midpoint
	 // (midpt1,midpt2)
      midpt1= ((x1+x2)/(2));
	  midpt2= ((y1+y2)/(2));
	 // prints out the slope of the 2 points
      System.out.println("The midpoint is: (" +midpt1+"," +midpt2+")");
   }
}