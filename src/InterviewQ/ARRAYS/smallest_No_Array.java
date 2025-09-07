package InterviewQ.ARRAYS;

public class smallest_No_Array {


    static void main(String[] args) {

        // smallest from the array
        int[] numbers = {12, 34, 10, 1};

        int min=numbers[0]; // assumed the first no. be smallest
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);

        // Similarly we can find the gratest number too.

        int max=numbers[0]; // assumed the 1st no. to be greatest
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);



    }
}
