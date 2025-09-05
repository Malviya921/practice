package InterviewQ;

import java.util.Scanner;

public class Grade_Calculator {
    static void main() {

        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here ");
        double number = sc.nextDouble();
        int round_off_1 = (int)number; // here 9.9 will give the 9.
        int round_off_2 = (int) Math.round(number); // here 9.9 will give the 10.

        if (round_off_2 >= 90 && round_off_2 <= 100) {
            System.out.println("you'r Grade is A");
        } else if (round_off_2 >= 80 && round_off_2 < 90) {
            System.out.println("you'r Grade is B");
        } else if (round_off_2 >= 70 && round_off_2 < 80) {
            System.out.println("you'r Grade is C");
        }else if (round_off_2 >= 60 && round_off_2 < 70){
            System.out.println("you'r Grade is D");
        } else if (round_off_2 >= 50 && round_off_2 < 60) {
            System.out.println("you'r Grade is F");
        }
        sc.close();
    }
}
