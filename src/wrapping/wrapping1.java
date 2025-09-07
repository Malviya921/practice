package wrapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class wrapping1 {
    static void main(String[] args) {

        // In Java, wrapping refers to the act of encapsulating a value, object, or functionality inside another construct—usually
        //  to add abstraction, flexibility, or utility.
        //  It’s a design pattern, a memory management strategy, and a usability enhancement all rolled into one.

        // wrapping can be called as Boxing

        //  1. Primitive Wrapping (Boxing)
        //  - Primitive types: int, double, char, etc.
        //  - Wrapper classes: Integer, Double, Character, etc.

        int a = 69;  // permitive
        Integer wrapped = Integer.valueOf(a); // manual Boxing


        // we can do auto boxing.
        Integer wrapped2 = a;

        // if we want to wrap into an arrayList
        List<Integer> wrapped0 = new ArrayList<>();
        wrapped0.add(a);
        System.out.println(wrapped0);

        // or int to ArrayList
        List<Integer> wraping = new ArrayList<>(Arrays.asList(a)); // we are able to use the Arrays.asList() to add an integer
        // because permitive type holds the actual value
        // but in case of array we will not be able to use Arrays.asList(), because print(array) will give the object reference not the
        // elemenst in it.
        // For object arrays like String[], Arrays.asList() unpacks each element and gives you a proper List<String>.
        // For primitive arrays like int[], it treats the entire array as a single object, resulting in a List<int[]> with one element.
        System.out.println(wraping);

        // or we can add in int(primitive) value to an #int[]array(primitive)
        int [] array = {a};
        int [] newarray = {2}; // array with one element
        int [] newarray2 = {}; // ERROR -- array index out of bound. {coz not initilize}
        // must specify either the size or the values while creating one.

        int [] array2 = new int[5]; // array with the specified length == 5
        newarray[0]=a;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newarray));


//-----------------------------------------------------------------------------------------

    }
}