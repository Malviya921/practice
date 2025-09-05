package InterviewQ;

import java.util.Scanner;

public class Leap_Year_Checke3 {
    //Leap Year Checke
    static void main(String[] args) {
        // what is a leap year ? a year with 366 no. of days or a year, where the february has 29 days.
        // but how do we know from the year itself ? like 2000 ?

        // It is divisible by 4, AND
        // But not divisible by 100, then it is a leap year.
        // but if it is divisible by 100 then check if it is also divisible by 400.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;

        //   || means OR → if either condition is true, it’s a leap year.
        if (year%4==0 && year%100 != 0 || year%400 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}

