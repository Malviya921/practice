package TryCatch;

public class test6a {

    public static void additon() {
        int a = 10;
        int b = 0;

        try {
            int result = a/b;
        } catch (Exception e) {
            System.out.println("this is handling in the mehtod where the fn. is written"); // // this code will run
            // bcoz exception has been handled here.
        }

        System.out.println("this is outside the try and catch");

    }

    public static void main(String[] args) {
        additon();
        System.out.println("this is in the main mehtod"); // this will obviously work.

    }

}