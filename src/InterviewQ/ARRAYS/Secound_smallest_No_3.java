package InterviewQ.ARRAYS;

import java.util.Arrays;

public class Secound_smallest_No_3 {
    static void main(String[] args) {
        // 2nd smallest from the array
        // for 2nd smallest no we need two variables here
        // we can find the smallest and 2nd smallest even if there is duplicate

        int[] arr = {12, 34, 10, 1, 53, 43, 3, 3, 5, 1, 1, 2, 2};


        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No distinct second smallest value found.");
        } else {
            System.out.println("Second smallest distinct number is: " + secondSmallest);
        }







    }
}