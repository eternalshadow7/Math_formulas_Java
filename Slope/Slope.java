// Janelynn Camingue
// Slope.java
// 1/17/17
// The program asks the user to input two points of a line and calculates the slope

import java.util.Scanner;

class Slope{
   public static void main( String[] args){
        
      int x1, x2, y1, y2, m;
      Scanner sc = new Scanner (System.in);
     
     // Asks the user for the 2 points needed to find the slope and then prints it out to show the user what they
	 // typed in as a whole

      System.out.println("First point");
	  System.out.print("X(1) is: ");
      x1 = sc.nextInt();
	  System.out.print("Y(1) is: ");
	  y1 = sc.nextInt();
	  System.out.println("Second point");
	  System.out.print("X(2) is: ");
      x2 = sc.nextInt();
	  System.out.print("X(2) is: ");
      y2 = sc.nextInt();
	  System.out.println("The first point is (" +x1+"," +y1+")");
	  System.out.println("The second point is (" +x2+"," +y2+")");
	  
     // formula for slope
      m = ((y2-y1)/(x2-x1));
	  
	 // prints out the slope of the 2 points
      System.out.println("The slope is: "+m+".");
   }
}