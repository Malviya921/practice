package InterviewQ;

import java.util.Scanner;

public class Palindrome_Checker {
    // Palindrome Checker
    // words like OYO, madam, 121, racecar
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input from user
        System.out.print("Enter a word here: ");
        String input = sc.nextLine(); // is for reading a String from the input.(so we can enter the numbers too)
        // It reads the entire line of input, including any spaces, up to the newline character.
        System.out.println("you entered "+input);

        // we need to normalize the input make the input either in the lower case or the upper case.
        String normalized = input.toUpperCase();
        System.out.println("After normalization "+ normalized);


        String reversed ="";

        for (int i = normalized.length()-1; i >= 0 ; i--) {
            reversed += normalized.charAt(i);
        }
        System.out.println("reversed = "+reversed);


        if (reversed.equals(normalized)){
            System.out.println("reversed = normalized so this is a palindrome");
        }else{
            System.out.println("reversed =! normalized so this is not a palindrome");
        }

    }
}
