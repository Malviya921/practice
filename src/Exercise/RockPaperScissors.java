package Exercise;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // we are creating a program for the rock, paper, scissors Game.
    /*
    o = rock
    1 = paper
    2 = scissors
    */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a number between 0,1 and 2 ");
        int input = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (input==computerInput){
            System.out.println("it is a draw");
        } else if (input==0 && computerInput==2 || input == 1 && computerInput==0 || input==2 && computerInput == 1) {
            System.out.println("you win");
        }
        else {
            System.out.println("computer wins");
        }

        System.out.println("computer choice is "+computerInput);

        /*
        if (computerInput == 0) {
            System.out.println("computer input is "+computerInput);
        } else if (computerInput==1) {
            System.out.println("computer input is "+computerInput);
        }
        else{
            System.out.println("computer input is "+computerInput);
        } */

        }
}
