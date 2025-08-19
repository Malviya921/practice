package collection_FRAMEWORK;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreehashSET01 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        // TreeSet -- no duplication(unique), sorted format
        // time complexity -- Big of log(n) , me operation ho rahe hote hai

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
