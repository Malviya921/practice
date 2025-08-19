package collection_FRAMEWORK;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
        // now from min heap to MAX HEAP


        pq.offer(169);
        pq.offer(69);
        pq.offer(9);
        pq.offer(90);

        System.out.println(pq);
        // max heap is getting implemented here that is why the largest one is coming out at first

        pq.poll(); //Removes and returns the highest priority element

        System.out.println(pq);

        System.out.println(pq.peek()); //Returns the largest element based on natural/comparator order



    }
}
