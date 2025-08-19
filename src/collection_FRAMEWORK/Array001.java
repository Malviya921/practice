package collection_FRAMEWORK;

import java.util.Arrays;

public class Array001 {
    public static void main(String[] args) {

        String [] student =  new String[30];

        student[0]= "ravi";
        student[10]= "prince";
        student[29]= "saini";
        System.out.println(student[9]); // no element set so null
        System.out.println(student[10]);
        System.out.println(student[0]);
        System.out.println(Arrays.toString(student)); // usign the to-string method which comes from the java.util.Arrays class.
        //  It's a static utility method that converts an array into a readable string format.
        // System.out.println(Arrays.deepToString(matrix)); // used for multi-dimentional Array

        // now let's try using for loop for printing the array.
 
        for (int i = 0; i < student.length ; i++) {
            System.out.print(student[i]);
            System.out.print(",");
            }




        }
    }
