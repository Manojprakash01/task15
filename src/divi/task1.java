package divi;
import java.util.Scanner;
public class task1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Prompt the user to enter the first integer
	            System.out.print("Enter the first integer: ");
	            int numerator = scanner.nextInt();

	            // Prompt the user to enter the second integer
	            System.out.print("Enter the second integer: ");
	            int denominator = scanner.nextInt();

	            // Perform division and handle possible exceptions
	            int result = numerator / denominator;

	            // Display the result
	            System.out.println("Result of " + numerator + " / " + denominator + " = " + result);
	        } catch (ArithmeticException e) {
	            // Handle division by zero
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (Exception e) {
	            // Handle other potential exceptions (e.g., input mismatch)
	            System.out.println("Invalid input. Please enter valid integers.");
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }
}
