package InterviewQ.String;

public class St_OB_R_Immutable_2 {
    public static void main(String[] args) {

        // using the System.identityHashCode to find out.

        // Declare and initialize a String
        String originalString = "Hello";

        // Print the original String and its hash code
        System.out.println("Original String: " + originalString);
        System.out.println("Hash code of originalString: " + System.identityHashCode(originalString));

        System.out.println("\n----------------------------------\n");

        // "Modify" the String by appending text.
        // This operation does not change the original object.
        originalString = originalString + " World";

        // Print the "modified" String and its new hash code
        System.out.println("Modified String: " + originalString);
        System.out.println("Hash code of modifiedString: " + System.identityHashCode(originalString));

    }
}
