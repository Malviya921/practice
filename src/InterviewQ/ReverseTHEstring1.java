package InterviewQ;

public class ReverseTHEstring1 {

    // using the String-Builder
    static void main() {

        String str = "hi my name is Ravi";

        String Reversed1 = String.valueOf(new StringBuilder(str).reverse());
//OR
        String Reversed2 = new StringBuilder(str).reverse().toString();

        System.out.println("Original String "+ str);
        System.out.println("reversed String "+Reversed1);

    }
}
