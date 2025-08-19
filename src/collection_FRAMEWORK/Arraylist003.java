package collection_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist003 {
    public static void main(String[] args) {

     List<Integer> numbers = new ArrayList<>();
     numbers.add(10);
     numbers.add(20);
     numbers.add(30);
     numbers.add(40);
     numbers.add(50);
     numbers.add(60);
     numbers.add(70);
     numbers.add(40);
     numbers.add(40);

     // if we want to iterater every elements of the arraylist for any action
     //we can use the for loop, for each loop OR Iterator

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
                    }
        System.out.println("--------------------------");

        for (Integer i:numbers){
            System.out.println(i);
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            System.out.println("the element is "+it.next());
        }

    }
}
