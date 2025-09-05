package InterviewQ.String;

public class blank_space_replace_St_Builder {
    public static void main(String[] args) {

        // NOTE
        // String_Builder - only remove the white space present in the sentence
        // but not tab or new line like - \n(represent the new line), \t(tab).

        String with_space = "Java   Programming   Language";

        String name = "this is the \t test \n string";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (char c : with_space.toCharArray()){
            if (c != ' '){
                sb.append(c);
            }
        }

        System.out.println("\n-----------------------------------------\n");

        for (char c : name.toCharArray()){
            if (c != ' '){
                sb1.append(c);
            }
        }

        System.out.println(sb);
        System.out.println(sb1);


    }
}
