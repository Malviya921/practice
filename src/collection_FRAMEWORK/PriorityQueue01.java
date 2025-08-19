package collection_FRAMEWORK;

import java.util.PriorityQueue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue(); // PriorityQueue (Min-Heap by default)


        pq.offer(169);
        pq.offer(69);
        pq.offer(9);
        pq.offer(90);

        System.out.println(pq);
        // min heap is getting implemented here that is why the smallest one is coming out at first

        pq.poll(); //Removes and returns the highest priority element

        System.out.println(pq);

        System.out.println(pq.peek()); //Returns the smallest element based on natural/comparator order



    }
}
