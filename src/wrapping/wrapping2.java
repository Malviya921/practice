package wrapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class wrapping2 {
    static void main(String[] args) {
        // wrapping array(primitive) in Collection[list,set etc.] using encapsulation

        // as we know arrays are fixed size and lack flexibility.
        // wrapping them in collection gives them dynamic behaviour.

        int[] number = {1,2,3,4};
        System.out.println(Arrays.toString(number)); //overridden to-String method in the Array Class

        // ArrayList<Integer> wrapped3 = new ArrayList<Integer>(Arrays.asList(number));

        // multi Dimension Array example -->
//        int[][] matrix = {
//                {1, 2},
//                {3, 4}
//        };
//        System.out.println(Arrays.deepToString(matrix)); //overridden to-String method


        // this is not going to work because primitive array will be treated as a single element
       // List<Integer> wrapped3 = new ArrayList<Integer>(Arrays.asList(number));
       // System.out.println(wrapped3);

        int [] numb = {1,2,4,54,5};
        List<Integer> wrapped = new ArrayList<>();
        for (int x : numb){
            wrapped.add(x);
        }
        System.out.println(wrapped);
//
        //---------------------------------------------
// this is not going to work because for a one-liner you need to use the Arrays.stream mehtod or need to use Integer
        // if you want to use it with the int use for loop ,or stream method

//        int [] numb2 = {1,2,4,54,5};
//        List<Integer> wrapped2 = new ArrayList<>(for(int y: numb2){
//            wrapped2.add(y);
//        });
//        System.out.println(wrapped2);
//---------------------------------------------------
        // Integer - worked
        Integer[] numb3 = {1, 2, 4, 5};
        List<Integer> wrapped3 = new ArrayList<>(Arrays.asList(numb3));
        System.out.println(wrapped3);

//---------------------------------------
  //using the stream class and in a single line while creating the arrayList.

        int [] numb4 = {4,5,4,5};
        List<Integer> wrapped4 = Arrays.stream(numb4).boxed().collect(Collectors.toList());
        // - Arrays.stream(numbers) creates an IntStream.
        //- .boxed() converts each int to Integer.
        //- .collect() gathers them into a LinkedList.

        System.out.println(wrapped4);










//        // array string into collection list.
//        String[] names = {"Prince", "Aryan", "Kunal"};
//        List<String> wrappedList = new ArrayList<>(Arrays.asList(names));
//

    }
}