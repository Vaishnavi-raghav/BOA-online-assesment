package program2;
import java.util.*;
public class Solution2 {
 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (scanner.hasNextLine()) {
	            String input = scanner.nextLine();
	            boolean isWellFormed = isWellFormedString(input);
	            System.out.println(isWellFormed ? "True" : "False");
	        }
	        scanner.close();
	    }

	    public static boolean isWellFormedString(String input) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : input.toCharArray()) {
	            if (c == '(' || c == '[') {
	                stack.push(c);
	            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } else {
	                return false; // Invalid character or mismatch
	            }
	        }

	        return stack.isEmpty(); // Stack should be empty if it's well-formed
	    }
	}

	
	

