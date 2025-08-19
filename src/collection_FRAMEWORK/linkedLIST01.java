package collection_FRAMEWORK;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedLIST01 {
    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        list1.add(4);
        System.out.println(list1);
        list1.add(1,69);
        System.out.println(list1);

        List<Integer> Alist = new ArrayList<>();
        Alist.add(100);
        Alist.add(200);
        Alist.add(300);
        System.out.println(Alist);

        list1.addAll(Alist);
        System.out.println(list1);

        System.out.println(list1.get(1));



    }


}
