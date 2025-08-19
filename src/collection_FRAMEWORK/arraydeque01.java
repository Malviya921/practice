package collection_FRAMEWORK;

import java.util.ArrayDeque;

public class arraydeque01 {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(45);
        adq.offerLast(20);
        adq.offer(69);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);


    }
}
