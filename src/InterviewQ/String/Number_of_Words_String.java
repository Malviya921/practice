package InterviewQ.String;

import java.util.Arrays;

public class Number_of_Words_String {
   public static void main(String[] args) {

       // this is to count the number of words in a string.

       String word1 = "   count   the   number    of \t words \n in a string   "; //word with space.
       String test = "Spectrophotofluorometrically"; //word without space.

       System.out.println(word1.length()); // Counts the species or blank keystroke as the world
       System.out.println(test.length()); // word without space, so we need to remove the space first from a string.

       // put the string character in the array of String.
       // we will Trim leading/trailing spaces and split by one or more spaces

       String[]word = word1.split("\\s+"); // dealing with the single space [single space,\t,\n] tab and new line]
       System.out.println(Arrays.toString(word)); // but no dealing with the leading and trailing space


       String[] words = word1.split(" "); // deals with the single space no tab or new line
       System.out.println(Arrays.toString(words)); // but no dealing with the leading and trailing space

       // finally, to avoid these problem be can use the trim split and custom delimiter [\\s+,;,|,:] etc.
       String [] array = word1.trim().split("\\s+"); // we dealt with the different type of delimiter and spaces
       System.out.println(Arrays.toString(array));

       // now we have array so we can count the number of elements in the array to get the number
       int number = array.length;
       System.out.println(number);







    }
}
