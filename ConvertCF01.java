/**
 * Description
 *
 * @author Ayana Bando
 * @since 2022-06-08
 * This program converts Celsius to Fahrenheit.
 */

import java.util.Scanner;

public class ConvertCF01 {
	
  public static void main (String[] args) {
    
    // All the dirty work happens in the 'convert()' method; let's call it here from the main method!
		convert();
  
  }
  
  public static void convert() {

    // This code will get a number from the user; you do not have to worry about this code yet!

    // Create a Scanner so user input can be read
    Scanner scanner = new Scanner(System.in);

    // Prompt user for a temperature
  	System.out.println("Enter a temperature in Celsius:");
	
	  // Read in a number and store it in 'celsius'
	  int celsius = scanner.nextInt();
    
    // ========== INSERT YOUR CODE HERE ==========
      //Calculates fahrenheit and stores it in 'fahrenheit' variable
      double fahrenheit = (double) celsius * 9/5 + 32;

      //Outputs a formatted message displaying fahrenheit conversion
      System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
        
        
        
        
        
        
        
    // ===========================================    
    
    
  }
  
}
