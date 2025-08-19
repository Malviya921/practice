package collection_FRAMEWORK;

import java.util.ArrayList;

public class timeCalculation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start));
    }
}
