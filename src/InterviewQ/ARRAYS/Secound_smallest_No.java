package InterviewQ.ARRAYS;

public class Secound_smallest_No {
    static void main(String[] args) {
        // 2nd smallest from the array
        // for 2nd smallest no we need two variables here
        // we can find the smallest and 2nd smallest even if there is duplicate

        int[] numbers = {12, 34, 10, 1, 53, 43, 2, 21, 4, 45, 65, 7, 8, 44,};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;


        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] < smallest ){
                smallest = numbers[i];
                }
            }

        for (int i=0; i < numbers.length ; i++){
            if (numbers[i] < secondSmallest && numbers[i] > smallest ){
                secondSmallest = numbers[i];
            }
        }


        System.out.println("smallest number is "+smallest);
        System.out.println("2nd smallest number is "+secondSmallest);



    }
}