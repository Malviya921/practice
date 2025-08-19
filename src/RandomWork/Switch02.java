package RandomWork;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
// switch statement with the string input

        String day = "sunday";
        // we can hard code.
        // OR
        // we can use the Scanner class to take the user input.

        Scanner input = new Scanner(System.in);
        System.out.println("enter the day here");
        String day1 = input.next(); // .next is used for a single word input
        // .nextLine will be used for a complete string input.

        switch (day1) {
            case "sunday":
                System.out.println("holiday");
                break;
            case "monday":
                System.out.println("working day");
                break;
            case "tuesday":
                System.out.println("working day");
                break;
            case "wednesday":
                System.out.println("working day");
                break;
            case "thursday":
                System.out.println("working day");
                break;
            case "friday":
                System.out.println("working day");
            case "saturday":
                System.out.println("holiday");
        }
        System.out.println("Run Again");
    }
}