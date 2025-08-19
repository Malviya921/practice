package collection_FRAMEWORK;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap01 {
    public static void main(String[] args) {
        Map <String,Integer> hashmap = new TreeMap<>();
        // Treemap gives us the sorted order WRT the keys.
        hashmap.put("D",05);
        hashmap.put("C",02);
        hashmap.put("A",03);
        hashmap.put("B",03);
        hashmap.put("E",03);


        System.out.println(hashmap);  // no order while printing
        System.out.println(hashmap.size());
        System.out.println(hashmap.isEmpty());
        System.out.println(hashmap.hashCode());
        hashmap.put("ravi",69); // ravi key already present but if we try to add again it will override the pair

        // to prevent overriding we can apply the condition
        if(!hashmap.containsKey("ravi")){
            hashmap.put("ravi",111);
        }
        //OR there is anither function put if absent
        hashmap.putIfAbsent("ravi",100);

        System.out.println(hashmap);

       //  now if we want to iterate the pairs of the map
       //  we can use for "each loop" for both "key and values"

        for (Map.Entry<String,Integer> e : hashmap.entrySet()){
            System.out.println(e); // To print out both value & pair.
            System.out.println(e.getValue()); // To print out only the values
            System.out.println(e.getKey()); // To print out only the keys
        }

        //or
        // we can use only the keys to sort them.

        for (String key: hashmap.keySet()){
            System.out.println(key+"_"+hashmap.get(key));
        }

     // System.out.println(hashmap.get(key)); // this did not work because map>hashmap>.get(key)--> function
        // which requires a key argument as input to give the respective value


        // OR we can use only the values to sort them.
        for(Integer val:hashmap.values()){
            System.out.println("-_-");
            System.out.println(val);
        }

        // other functions like contains(key/value), is empty, remove, clear etc.

        System.out.println(hashmap.containsKey("gandhi"));
        System.out.println(hashmap.containsValue(2));

        System.out.println(hashmap.isEmpty());
        hashmap.remove("E");
        hashmap.clear();
        System.out.println(hashmap);

// Sorted do all the operations will be in the O(log n)

    }
}
