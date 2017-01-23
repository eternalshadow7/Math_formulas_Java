// Janelynn Camingue
// Cone_Volume.java
// Lets the user input a base and heigth of the cone (in cubic meters) and calculates the volume to a decimal

import java.util.Scanner;

class Cone_Volume{
   public static void main( String[] args){
        
      double base, height, volume;
      Scanner sc = new Scanner (System.in);
     
      // Lets the user input the base and height of the cone       
      System.out.print("The base is: ");
      base = sc.nextDouble();
	  System.out.print("The height is: ");
      height = sc.nextDouble();
      
      // calculates the volume using formula bh/3 in cubic meters
      volume = (((base*height))/(3));
      System.out.println("The volume of the cone is: "+volume+" cubic meters.");

   }
}
       
        
   

        
   
