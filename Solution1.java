package AlternateCase;
import java.util.Scanner;

public class Solution1 {

	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        while (scanner.hasNextLine()) {
	            String input = scanner.nextLine();
	            String result = alternateCase(input);
	            System.out.println(result);
	        }
	        scanner.close();
	    }

	    public static String alternateCase(String input) {
	        StringBuilder result = new StringBuilder();
	        boolean toUpperCase = true; // Start with uppercase
	        for (char c : input.toCharArray()) {
	            if (Character.isLetter(c)) {
	                if (toUpperCase) {
	                    result.append(Character.toUpperCase(c));
	                } else {
	                    result.append(Character.toLowerCase(c));
	                }
	                toUpperCase = !toUpperCase; // Toggle the case flag
	            } else {
	                result.append(c); // Keep non-alphabetic characters as is
	            }
	        }
	        return result.toString();
	    }
	}


