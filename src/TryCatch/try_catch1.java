package TryCatch;
//        try {
//            // Code that may throw an exception
//            int result = 10 / 0; // This will throw ArithmeticException
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            // Code to handle the exception
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//        System.out.println("Program continues...");

public class try_catch1 {
    public static void main(String[] args) {

        int a = 12;
        int b=0;

        try {
            double c = a / b;
            System.out.println("this is the first try 1");
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());

        }
        System.out.println("program still going");

    }
}