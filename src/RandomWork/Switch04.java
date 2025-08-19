package RandomWork;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
// switch statement with the Arrays input

        String [] fruits = {"mango","banana","papaya","orange","apple"};

        int index = 2;
        // we will be taking the user input here for the index.

        Scanner input = new Scanner(System.in);
        System.out.println("enter your input here between 1 to 5");
        int Index = input.nextInt();

        String yourFruit="";

        switch(fruits[Index]){
        case "mango":
        yourFruit="mango";
        break;
        case "banana":
        yourFruit="banana";
        break;
        case "papaya":
        yourFruit="papaya";
        break;
        case "orange":
        yourFruit="orange";
        break;
        case "apple":
        yourFruit="apple";
        break;
        }
        System.out.println("your fruit name is "+ yourFruit);

    }
}