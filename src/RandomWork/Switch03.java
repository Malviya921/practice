package RandomWork;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
// switch statement with the Arrays input

        String [] fruits = {"mango","banana","papaya","orange","apple"};

        int index = 2;
        // here the array we created above is of no use because we have directly taken the input as int and defined the fruit.

        String yourFruit="";

        switch(index){
        case 1:
        yourFruit="mango";
        break;
        case 2:
        yourFruit="banana";
        break;
        case 3:
        yourFruit="papaya";
        break;
        case 4:
        yourFruit="orange";
        break;
        case 5:
        yourFruit="apple";
        break;
        }
        System.out.println("your fruit name is "+ yourFruit);

    }
}