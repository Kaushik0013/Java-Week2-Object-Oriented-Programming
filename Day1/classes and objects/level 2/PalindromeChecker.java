import java.util.Scanner;

public class PalindromeChecker {
    public String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean checkPalindrome() {
        String reversalString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversalString += text.charAt(i);
        }
        return text.equals(reversalString);
    }

    public void displayDetails() {
        if (checkPalindrome()) {
            System.out.println("The text " + text + " is a palindrome.");
        } else {
            System.out.println("The text " + text + " is not a palindrome.");
        }
    }

    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
        System.out.print("Enter text to check: ");
        String userInput = input.nextLine();

        PalindromeChecker checker = new PalindromeChecker(userInput);
        checker.displayDetails();

        input.close(); 
    }
}
