package InterviewQ.String;

public class String_operation {
    public static void main(String[] args) {

        String s1 = "Ravi";  // --> object from String Pool
        String s2 = "Prince";  // --> object from String Pool

        String s4 = new String("Ravi"); // --> object in heap area, created using the new keyword but given a string as argument.
        String s5 = new String(s1); // --> object in heap area, created using the new keyword but given s1 as argument.

        // Adding 2 Strings
        // 1. using the "+" operator
        // 2. using the [.concat] method
        // NOTE [.concat()] does not modify the original string → Strings are immutable.


        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        String s3 = s2;
        System.out.println(s2.equals(s3)); // equate the content inside the s3,s2
        System.out.println(s2==s3); // equals equate the content inside the string reference.
        System.out.println("\n-----------------------------------\n");
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));

        // NOTE
        // Use == only when you want to check if two references point to the same object.
        // Use .equals() when you want to check if two strings (or objects) have the same content.

//---------------------------------------------------------------------------------------------------------
        // Hash Code of a String
        String abc = "abc";  // String object created in the string pool.
        String xyz = new String("abc"); // string object create in the heap area.

        System.out.println(abc.hashCode()); // but they still have the same hash code.
        System.out.println(xyz.hashCode()); // same hash code.
        // NOTe -- hashCode() in String is based on content, not memory address.
        // so same characters, they’ll have the same hashCode

        // NOTE
        // System.identityHashCode(obj) gives the object’s actual memory identity hash
        // ,not content-based hash.

        System.out.println(System.identityHashCode(abc)); // takes the String Object as the input.
        System.out.println(System.identityHashCode(xyz)); // comes from java.lang.system


    }
}
