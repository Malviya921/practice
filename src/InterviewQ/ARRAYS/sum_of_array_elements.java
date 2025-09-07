package InterviewQ.ARRAYS;

public class sum_of_array_elements {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 10};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
