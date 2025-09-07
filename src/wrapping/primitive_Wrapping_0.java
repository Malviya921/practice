package wrapping;

public class primitive_Wrapping_0 {
    static void main() {
        //Boxing / Unboxing OR Wrapping - Unwrapping
        //Boxing = wrapping a primitive inside its wrapper class (int → Integer, double → Double, etc.).
        //Unboxing = extracting the primitive from the wrapper (Integer → int).
        //Introduced in Java 5 with autoboxing/unboxing (automatic conversion).

        int x= 10;

        Integer z = x;  // Auto Boxing
        Integer y = Integer.valueOf(x); // manual boxing

        String str = "123";
        Integer ab = Integer.valueOf(str);
        System.out.println(ab);

        System.out.println("-----------------------------");

//        String str1 = "a"; // string should contain the number
//        Integer abc = Integer.valueOf(str1);
//        System.out.println(abc);  // this wil through an exception "java.lang.NumberFormatException"
        // which will come under the Runtime Exception. JVM will execute the code line by line
        // the JVM cannot convert the non-numeric characters into an integer and, therefore, throws the error


        //---------------------------------------

        // Boxing / Unboxing

        Integer num = Integer.valueOf(10);// int is a primitive data type so we are using the Integer.valueof()
        // because it gives us an object of Integer which we are assigning to the container num which is Integer type.
        int c = num.intValue(); // Explicit unboxing --> it gives us the primitive value of Integer
        System.out.println(c);

        //-----------------------------------------

        Integer boxed = 10;   // behind the scene it is working like above
        int inte = boxed; // Implicit unboxing

        //-------------------------------------------

        // Exception in wrapping/Boxing
        Integer abc = null;
        int xyz = abc.intValue(); // this is going to throw an error "java.lang.NullPointerException" [compile time.]


    }
}
