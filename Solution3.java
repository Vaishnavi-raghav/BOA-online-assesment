package PROGRAM3;
import java.util.Scanner;
public class Solution3 {

	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Read the input value eRP
	        System.out.print("Enter the employee's ERP: ");
	        int eRP = scanner.nextInt();

	        // Calculate the ERG character based on the input ERP
	        char ERG;
	        if (eRP >= 30 && eRP <= 50) {
	            ERG = 'D';
	        } else if (eRP >= 51 && eRP <= 60) {
	            ERG = 'C';
	        } else if (eRP >= 61 && eRP <= 80) {
	            ERG = 'B';
	        } else if (eRP >= 81 && eRP <= 100) {
	            ERG = 'A';
	        } else {
	            System.out.println("Invalid ERP value. ERP should be in the range [30, 100].");
	            return; // Exit the program
	        }

	        // Print the calculated ERG character
	        System.out.println("ERG: " + ERG);

	        // Close the scanner
	        scanner.close();
	    }
	

}
