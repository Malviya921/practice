package InterviewQ.String;

import java.util.Arrays;

public class Split_function {
   public static void main(String[] args) {

       // Split function on a string
       // using the .trim.split("gerex here"), like \\s,\\s+,[\\s+,|,;]
       // STRING to the ARRAY while dealing with the delimiter.

        String sentence = "    this is the sentence \t we \n need to convert     ";
        // using the split function and
        String[] names = sentence.split("\\s"); // this will keep the space b4 and after
        System.out.println(Arrays.asList(names));
        // using the trim function b4 split
        String[] names2 = sentence.trim().split("\\s"); // this will remove the space b4 and after,
        // but can not remove \t and \n
        String[] names3 = sentence.trim().split("\\s+"); // this (+) will remove the \t & \n too,
        // can handle multiple space

        System.out.println(Arrays.asList(names2)); // this without the handling of \t and \n
        System.out.println(Arrays.asList(names3)); // after handling the \t & \n

        System.out.println("----------------------------------------------------------------");

        // note
       // Rule of Thumb
       //Use replaceAll("\\s","") → if you want to remove all whitespace.
       //Use split("\\s+") → if you want to split words correctly ignoring multiple spaces, tabs, newlines.

       //replaceAll("\\s", "")
       //\s = any whitespace character
       //(space ' ', tab \t, newline \n, carriage return \r, form feed, etc.)
       //So it removes all whitespace kinds, not just spaces.

       // but
       //split("\\s")
       //Splits on a single whitespace character only.
       //If you have multiple spaces/tabs/newlines together, it may create empty strings in the result array.


    }
}