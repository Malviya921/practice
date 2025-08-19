package collection_FRAMEWORK;

import java.util.LinkedList;
import java.util.Queue;

public class queue01 {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();  // LinkedList as Queue (FIFO)

        number.offer(12);
        number.offer(13);
        number.offer(14);
        number.offer(15);

        System.out.println(number);

        System.out.println(number.poll()); // Removes and returns the head of the queue

        System.out.println(number.peek()); // Returns the first inserted element (head of queue)



    }
}
