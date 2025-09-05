package InterviewQ.String;

public class St_OB_R_Immutable_3 {

    public static void main(String[] args) {

        // Using the concat function to check.

        // Create a String object
        java.lang.String s1 = "Hello";
        System.out.println("Original String (s1): " + s1);

        // Try to modify s1
        java.lang.String s2 = s1.concat(" World");

        // Print both references
        System.out.println("After concatenation, s1: " + s1);
        System.out.println("New String (s2): " + s2);

        // Compare references
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2));

    }
}
