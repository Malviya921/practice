package InterviewQ.ScannerClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class stdin_stdout_2 {
    static void main() {

        // SCANNER CLASS [we need to use the scanner class]
        // coz scanner class help us read the files, string with custom delimiter

// SO we can convert the string into An array but b4 we need to convert it to the ARRAYLIST.
        // directly create the program.

        String words = "this is \n the \t sentence"; // a word with a space, new line (\n) and tab (\t)
        Scanner sc = new Scanner(words);

        // adding the arraylist and print to check if the arraylist has all the elements is it
        List <String> arrayL = new ArrayList<>();
        while (sc.hasNext()){
            arrayL.add(sc.next());
        }
        System.out.println(arrayL);


        // now convert  the arraylist to the array and print
        String[] Array_4m_arraylist = arrayL.toArray(new String[0]);
        System.out.println(Arrays.asList(Array_4m_arraylist));

//------------------------------------------------------------------------------------
    // but we can do the same thing without using the Scanner class or arraylist
    // directly trimming and splitting the string using the .trim & .split functions.
        // a string or User input may contain many space or tab ot new line or a custom delimiter
        // we can provide the custom delimiter in the scanner class and direct split method

          String sentence = "    this is the sentence \t we \n need to convert     ";
   // using the split function and
        String [] names = sentence.split("\\s"); // this will include the space b4 and after
        System.out.println(Arrays.asList(names));
   // using the trim function b4 split
        String [] names2 = sentence.trim().split("\\s"); // this will remove the space b4 and after,
        // but can not remove \t and \n
        String [] names3 = sentence.trim().split("\\s+"); // this (+) will remove the \t & \n too,
        // can handle multiple space

        System.out.println(Arrays.asList(names2)); // this without the handling of \t and \n
        System.out.println(Arrays.asList(names3)); // after handling the \t & \n

        System.out.println("----------------------------------------------------------------");






    }
}
