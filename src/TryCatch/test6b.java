package TryCatch;

public class test6b {
    /* so the difference is if we handle the error in the initial stage then the rest of the code will run.
    but if we handle the code in the later stage then the original code after the exception will not run but the code where it is
    handled will run.
     */




    public static void additon() {
        int a = 10;
        int b = 0;
        int result = a/b;
        System.out.println("this is outside the try and catch");  // this code will not run.
    }

    public static void main(String[] args) {
        try {
            additon();
        } catch (Exception e) {
            System.out.println("this is handling in the calling/main mehtod"); // this code will run
        }
        System.out.println("this is in the main mehtod outside the try catch"); // this code will run too

    }

}