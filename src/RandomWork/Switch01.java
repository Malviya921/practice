package RandomWork;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        int A = 2;
        // we can hard code.
        // OR
        // we can use the Scanner class to take the user input.

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number between 1 and 5 ");
        int a = input.nextInt();


        switch (a) {
            case 1:
                System.out.println("odd number");
                break;
            case 2:
                System.out.println("even number");
                break;
            case 3:
                System.out.println("odd number");
                break;
            case 4:
                System.out.println("even number");
                break;
            case 5:
                System.out.println("odd number");
                break;
        }
        System.out.println("Done");
    }
}