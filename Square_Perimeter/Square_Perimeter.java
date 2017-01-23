// Janelynn Camingue
// Square_Perimeter.java
// This program asks the user for a side length of a square and calculates the perimeter in inches

import java.util.Scanner;

class Square_Perimeter{
   public static void main( String[] args){
        
      int side, perimeter;
      Scanner sc = new Scanner (System.in);
     
      // Asks the user for the length of one of the sides     
      System.out.print("The length of one of the sides is: ");
      side = sc.nextInt();
      
      // Formula for the perimeter of a square is P=4a
	  // perimeter = 4(side length)
	  // perimeter = side length + side length + side length + side length
      perimeter = 4*side;
      System.out.println("The perimeter of the square is: "+perimeter+" inches.");

   }
}
       
        