package InterviewQ.ARRAYS;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // odd or even from an array
        int[] numbers = {1, 2, 3, 4,5,6,7,8,9};

        System.out.print("Even Numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }


        System.out.print("\nOdd Numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
