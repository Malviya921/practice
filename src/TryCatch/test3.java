package TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test3 {
    public static void main(String[] args) throws FileNotFoundException {
        method1();
    }



//
//
    public static void method1() {
//        try{
//            FileReader fileReader = new FileReader("abc.txt");
//        }catch (FileNotFoundException e){
//            System.out.println("kya hai bhai ye ?");
//            throw new FileNotFoundException("nahi mili file!");
//        }


        try {
            FileReader file = new FileReader("bcb.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("custom throw i am using");
            // we can do like this can catch one Exception in the catch and can throw different Exception using the throw keyword

            // NOTE --> if we use the Checked Exception	then we must declare with throws in the method calling or use the tru catch.



        }



        System.out.println("this is after the try catch");



    }



}