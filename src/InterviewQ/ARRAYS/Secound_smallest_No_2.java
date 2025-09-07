package InterviewQ.ARRAYS;

import java.util.Arrays;

public class Secound_smallest_No_2 {
    static void main(String[] args) {
        // 2nd smallest from the array

        int[] numbers = {12, 34, 10, 1, 53, 43, 2, 21, 4, 45, 65, 7, 8, 44,};

        // simple way using the Arrays.sort(); function

        Arrays.sort(numbers); // ascending by default
        System.out.println(Arrays.toString(numbers));

        System.out.println("2nd smallest no is " + numbers[1]);









    }
}