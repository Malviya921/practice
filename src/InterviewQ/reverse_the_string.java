package InterviewQ;

public class reverse_the_string {
    static void main(String[] args) {

        String name = "MADAM";

        String reverse=""; // local variable declared in the Method but not initialize.
        // need to Initialize coz it is in the main method not int he class

        for (int i = name.length()-1; i >=0 ; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
