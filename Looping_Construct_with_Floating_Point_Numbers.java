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
        double maxValue = Double.NEGATIVE_INFINITY; // Initialize maxValue to negative infinity
        double minValue = Double.MAX_VALUE; // Initialize minValue
        int i = 0;

        while (i < 5) { // Change condition to loop 5 times
            System.out.println("Enter a value: "); // Get user input
            userInput = scnr.nextDouble(); // Change to nextDouble() to read double values
            total += userInput;
            if (userInput > maxValue) { // Check Max Value
                maxValue = userInput;}
            if (userInput < minValue) { // Check Min Value
                minValue = userInput;}
            i++; // Increment i by 1
        }
        if (i > 0) { // Ensure division by zero is avoided
            avg = total / i; // Calculate average value
            System.out.println("The total value is: " + total); // Print total
            System.out.println("The average value is: " + avg); // Print Average
            System.out.println("The maximum value is: " + maxValue); // Print Max value
            System.out.println("The minimum value is: " + minValue); // Print Min Value
            System.out.println("The interest at 20% is: " + total * 0.20); // Calculate and print interest @ 20%
        } else {System.out.println("No values were entered.");}
        scnr.close(); // Close scanner
    }
}
