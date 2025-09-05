package InterviewQ.String;

import java.util.Arrays;

public class blank_space_replace_St_Builder3 {
    public static void main(String[] args) {

        // NOTE
        // String_Builder - only remove the white space present in the sentence
        // but not tab or new line like - \n(represent the new line), \t(tab).

        // 1. we have a string
        String name = "    this      is     the \t test \n string      ";

        // 2. created the String BUilder OBject
        StringBuilder sb = new StringBuilder();

        // 3. converted string to the char Array
        char[] word = name.toCharArray();
        System.out.println(Arrays.toString(word));

        // 4. advance for loop on the char array and checked for the space & append the String Builder Object.
        for(char c: word){
            if (!Character.isWhitespace(c)){ // this is another way to "Char check in loop"
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
