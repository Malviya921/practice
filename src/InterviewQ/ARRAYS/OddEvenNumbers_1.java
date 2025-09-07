package InterviewQ.ARRAYS;

import java.util.Scanner;

public class OddEvenNumbers_1 {
    public static void main(String[] args) {
        // odd or even from the user input

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number here");

        int number_1 = (int)Math.round(input.nextDouble()); // this will round the number
        System.out.println("Your number is --> "+number_1);

//        int number_2 = (int) input.nextDouble();// this will round the double without taking the .num into consideration
//        System.out.println(number_2);

        if (number_1 % 2 == 0 ){
            System.out.println(number_1 + " This Number is EVEN");
        }else {
            System.out.println(number_1 + " is Odd");
        }










    }
}