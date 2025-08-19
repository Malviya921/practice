package collection_FRAMEWORK;

import java.util.HashSet;
import java.util.Set;

public class hashSET01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // hashset -- no duplication, random order
        // time complexity -- Big of log(1) me sare operations ho rahe hote hai.

        set.add(13);
        set.add(1);
        set.add(52);
        set.add(83);
        set.add(14);
        System.out.println(set);
        set.add(14);
        System.out.println(set);
        set.remove(52);
        System.out.println(set);
        System.out.println(set.contains(13));
        System.out.println(set.contains(69));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
