package TryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class test5 {
    /* so if we want the program to continue then we need to use the try catch somewhere

     */



    public static void main(String[] args) throws FileNotFoundException {

        try {
            extracted();
        } catch (Exception e) {
            System.out.println("this is the line after the exception");
            //throw new RuntimeException(e);
        }
        System.out.println("line outside the try catch");
    }

    private static void extracted() throws FileNotFoundException{
        FileReader file = new FileReader("abc.txt");

//        try {
//            FileReader file = new FileReader("abc.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("this is the line after the exception");
//
//        }
    }
}
