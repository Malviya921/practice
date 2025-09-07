package InterviewQ.ARRAYS;

import java.util.Arrays;

public class Ascending_array {
    static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1};

        Arrays.sort(numbers);

        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // OR Directly
        System.out.print("\nSorted Array: "+Arrays.toString(numbers));





    }
}