import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to lowercase and remove spaces (optional but useful)
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Push characters into stack
        for (int i = 0; i < processedInput.length(); i++) {
            stack.push(processedInput.charAt(i));
        }

        // Pop characters to create reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed strings
        if (processedInput.equals(reversed)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        scanner.close();
    }
}