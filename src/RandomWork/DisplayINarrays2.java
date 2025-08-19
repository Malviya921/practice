package RandomWork;

import java.util.Arrays;


public class DisplayINarrays2 {
    public static void display(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for newline
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        display(numbers);
    }

}
