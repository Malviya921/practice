package collection_FRAMEWORK;

import java.util.ArrayList;
import java.util.List;

public class Arraylist002 {
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
        System.out.println(numbers);
//-----------------------------------------------------
        numbers.set(7,69);
        System.out.println(numbers);
//-----------------------------------------------------
     numbers.remove(0);
        System.out.println(numbers); // this will remove the element presrent at the given index
//-----------------------------------------------------
     numbers.remove(Integer.valueOf(40)); // this will remove the value which matches the input only once(1st match)
     numbers.remove(Integer.valueOf(69));
        System.out.println(numbers);
//-----------------------------------------------------
        System.out.println(numbers.contains(20)); // if contains true
        System.out.println(numbers.contains(100));// if not then false
//-----------------------------------------------------

        numbers.clear();
        System.out.println(numbers);


    }
}
