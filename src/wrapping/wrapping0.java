package wrapping;

import java.util.ArrayList;
import java.util.List;

public class wrapping0 {
    static void main() {

        // creating the arraylist of the int[] - an object , because the arraylist requires an object we can use the
        // array like int[],char[],double[] even though they are the array made using the primitive values they still
        // are object of array class but the object will be treated as a single unit rather that separate arrays.


        // using wrapper class 1st to create array and using the Arrays Util class to operate on them
        Integer[] number = {1,2,3,4,5,6};
        Integer[] arr2 = {10, 20, 30};

        System.out.println(number); //--> will give you the hash code
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.asList(arr2));
//
//        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(number));
//        System.out.println(list1);
//        System.out.println(list1.size());

   //     System.out.println(Arrays.toString(a));

        int[] a = {1,2,3}; //--> valid way of creating the array.Declare with Values Only.
        int[] b = new int[5]; //--> valid way of creating the array. or Declare with size only.
        // int[] c = new int[5]{1,2,4}; //--> invalid way , both size and value can not be given.
        List<int[]> number1 = new ArrayList<>();
        number1.add(a);
        number1.add(new int[6]);
        number1.add(new int[]{1,23});
        number1.add(b);

        System.out.println(number1);
        System.out.println(number1.size());
        // it will print us the size and the HashCode of the array int[] (which is primitive)
        // they treat them as the single object of primitive values.

        // similarly we can create the array of any custom object.




    }
}
