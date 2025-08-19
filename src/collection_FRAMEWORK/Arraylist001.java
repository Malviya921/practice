package collection_FRAMEWORK;

import java.util.ArrayList;

public class Arraylist001 {
    public static void main(String[] args) {

        ArrayList mylist2 = new ArrayList();
        mylist2.add("Pramod");
        mylist2.add("Amit");
        mylist2.add("ram");
        mylist2.add("ravi");
        mylist2.add(123); // different data type we can add
        mylist2.add(true); // different data type we can add


        ArrayList alist = new ArrayList();
        alist.add(9);
        alist.add(8);
        alist.add(7);
        alist.add(6);
        alist.add(5);
        alist.add(4);
        alist.add(3);
        alist.add(2);
        alist.add(1);
        alist.add("ravi"); // String as we have not specified the data type so we can add heterogeneous data
        alist.add(true); // boolean
        alist.add("last element"); // boolean

        System.out.println(alist.size());
        System.out.println(alist);
        System.out.println(alist.contains("ravi"));
        System.out.println(alist.contains(true));

        System.out.println(alist.size());

//---------------------------------------------------------------------------
        // add and add all works differently
        // add will treat the arraylist as one
        alist.add(mylist2);
        System.out.println(alist);

//---------------------------------------------------------------------------

        // ADD all will take every element and add them SEPARATELY
        alist.addAll(mylist2);
        System.out.println(alist);
        System.out.println(alist.size());
//---------------------------------------------------------------------------

      // adding will add an element and move the other,so increases the size of the arraylist
        alist.add(9,0);
        System.out.println(alist);
        System.out.println(alist.size());

//---------------------------------------------------------------------------

       // set will replace the element already present in the array list
        alist.set(0,69);
        System.out.println(alist);
        System.out.println(alist.size());


    }
}
