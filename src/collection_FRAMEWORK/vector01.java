package collection_FRAMEWORK;

import java.util.*;

public class vector01 {
    public static void main(String[] args) {
        // vector are nothing but arraylist with thread safety
        //Vectors and ArrayLists are both resizable arrays and implement the List interface. The key difference is:
        //- Vector is synchronized → thread-safe by default.
        //- ArrayList is not synchronized → faster, but not thread-safe unless wrapped manually.
        //
        //🔍 Key Differences
        //|   Feature           | ArrayList            |  Vector |
        //| Thread Safety | ❌ Not synchronized | ✅ Synchronized (thread-safe) |
        //| Performance | 🚀 Faster (no locking) | 🐢 Slower (due to locking) |
        //| Legacy Status | ✅ Modern (JDK 1.2+) | 🕰️ Legacy (pre-Collections) |
        //| Growth Strategy | +50% size increase | ×2 size increase |
        //| Traversal | Iterator only | Iterator & Enumeration |

        //🧠 Refined Statement
        //“Vector is a legacy thread-safe alternative to ArrayList, with synchronized methods and slower performance.”

        List<String> vec1 = new Vector();
        vec1.add("tom");
        vec1.add("kom");
        vec1.add("som");
        vec1.add("md");
        vec1.add("thermo");
        System.out.println(vec1);
        vec1.add(1,"Ha Bhai");
        System.out.println(vec1);
//-------------------------------------------------------------------------
        Vector <Object> vec2 = new Vector<>(vec1); // This created a new vector does not add to the existing one.
        System.out.println(vec2);
//-------------------------------------------------------------------------
        Vector<Object> vec3 = new Vector<>(); // This will add elements to the existing vactor.
        // Appends all elements from one vector to another
        vec3.add("first Element");
        vec3.add("123");
        vec3.addAll(vec1);
        System.out.println(vec3);
//--------------------------------------------------------------------------
        // use Collections.copy(new Vector, old Vector)
        // size of the old vector and new vector should be same otherwise will throw exception index out of bound
        Vector<Object> vec4 = new Vector<>();
        vec4.add("new element");
        vec4.add(321);
        vec4.add(000);
        vec4.add("-_-");
        vec4.add(";)");
        vec4.add("Last element");
        System.out.println(vec4);
        Collections.copy(vec4,vec1);
        System.out.println(vec4);
//-----------------------------------------------------------------------------
        // removing the elements from a given vector.
        vec4.remove(4);
        System.out.println(vec4);
        vec4.removeElement("tom");
        System.out.println(vec4);

        // removing all the elements from a given vector.
        vec4.removeAll(vec4);
        System.out.println(vec4);

//--------------------------------------------------------------------------------

        Vector <String> str1 = new Vector<>(3,2);
        str1.add("name here");
        str1.add("name");
        str1.add("here");
        System.out.println(str1.size());
        str1.add("N");
        System.out.println(str1.size());






    }
}
