package InterviewQ.ScannerClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stdin_stdout_1 {
    static void main() {

        // Sting to the array list and to array using the Scanner class object.

        String sentence = "these are some numbers 12 23 34 54";
        Scanner scOBJECT = new Scanner(sentence); // given String as input
        // NOTE --> scanner object split the input into the token, not when we use the [.nextline].


// now let's print the scanner object
        while (scOBJECT.hasNext()){
            System.out.println(scOBJECT.next());
        }

        // OR we can a
        String a = scOBJECT.next();
        String b = scOBJECT.next();
        String c = scOBJECT.next();
        String d= scOBJECT.next();
        String e = scOBJECT.next();
        String f = scOBJECT.next();
        String g = scOBJECT.next();
        String h = scOBJECT.next();

        System.out.println(a+b+c+d+e+f+g+h);


// or we can convert the string into An array but b4 we need to convert it to the ARRAYLIST.

        // directly giving the string
        ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList(sentence));

        // in this case we will only get one token, we need to run a loop to add the token further
        ArrayList<String> arraylist2 = new ArrayList<String>(Arrays.asList(scOBJECT.next()));

        System.out.println(arraylist2);
        System.out.println(arraylist2.size());
        arraylist2.add("ravi");
        System.out.println(arraylist2);
        System.out.println("==== CHECK ====");







// here we created the string, with a FIXED SIZE,so we should know the size b4 creating
//  which is why we need to create the array list first.
// so we need to create arraylist b4 array.[in order to convert the string into An array]

//        String [] array1 = new String[8];
//
//        for (int i = 0; i < array1.length ; i++) {
//            array1[i]=scOBJECT.next();
//        }
//         System.out.println(Arrays.toString(array1));



        // NOTE --> READ THE NEXT FILE.


    }
}
