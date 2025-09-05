package InterviewQ.String;

import java.util.Arrays;

public class blank_space_replace_St_Builder2 {
    public static void main(String[] args) {

        // NOTE
        // String_Builder - only remove the white space present in the sentence
        // but not tab or new line like - \n(represent the new line), \t(tab).

        String with_space = "Java   Programming   Language";

        String name = "    this      is     the \t test \n string      ";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();


        char[] word = with_space.toCharArray();
        System.out.println(Arrays.toString(word));

        for (char c : word){
            if (c != ' '){   // as the string os converted to the char array each space will be holding a separate index
                // so will ge recognised and will get removed by the loop, but not be able to remove the \t and \n
                sb.append(c);
            }
        }
        System.out.println(sb);

        System.out.println("\n-----------------------------------------\n");

        char [] letters = name.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (char c : letters){
            if (c != ' ' && c!='\t' && c!='\n'){ // we used the multiple conditions to deal with the different spaces
                sb1.append(c);
            }
        }
        System.out.println(sb1);


        // Single quotes denote a single character literal (char) in Java.
        // example:
        // ' ' represents a single space character.
        // '\t' is a tab character.
        // ' ' is a newline character.
        // Double quotes (" ") denote a String literal, which is a sequence of characters, not a single char.
        // So " " is a String of length 1, not a char.
        // Single quotes ' ' are used in Java to define single character literals (char).
        // Since elements of char[] are characters, comparisons use single quotes to check those characters.
        // Double quotes " " create String objects and should not be used when comparing a single character.




    }
}
