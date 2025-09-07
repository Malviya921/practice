package InterviewQ.ARRAYS;

public class Secound_smallest_No_4 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 3, 17, 3};

        // declared the two variable
        int smallest, secondSmallest;

        // Initialize with first two elements
        if (arr[0] < arr[1]) {
            smallest = arr[0];
            secondSmallest = arr[1];
        } else {
            smallest = arr[1];
            secondSmallest = arr[0];
        }

        // Start from index 2
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (smallest == secondSmallest) {
            System.out.println("No distinct second smallest value found.");// for [1,1,1,1] such array
        } else {
            System.out.println("Second smallest number is: " + secondSmallest);
        }
    }
}