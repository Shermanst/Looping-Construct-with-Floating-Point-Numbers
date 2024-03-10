/*  This program uses a while-loop to read in a set of five floating-point
 *  values from user input then print the following: Total, Average, Maximum
 *  Minimum, and interest on total at 20%
*/
import java.util.Scanner;

public class Looping_Construct_with_Floating_Point_Numbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double userInput;
		double total = 0.0;
		double avg = 0.0;
		double maxValue = 0.0;
		double minValue = Integer.MAX_VALUE;
		int i = 0;
		
		while (i <= 4) {  // this will only loop 5 times
						
			System.out.println("Enter a value: ");   // Get user input
			userInput = scnr.nextInt();
			total = total + userInput;
			
			if (userInput > maxValue) {   // Check Max Value
				maxValue = userInput;}
			
			if (userInput < minValue) {   //  Check Min Value
				minValue = userInput;}
		
			i += 1;    // increment i by 1
		}
		
		avg = total / 5;	// Calculate average value

		System.out.println("The total value is: " + total); //Print total
		
		System.out.println("The average value is: " + avg); // Calculate and print Average
		
		System.out.println("The maximum value is: " + maxValue); // Print Max value
		
		System.out.println("The minimum value is: " + minValue); // Print Min Value
		
		System.out.println("The interest at 20% is: " + total * .20); // Calculate and print interest @ 20%
	}
}	