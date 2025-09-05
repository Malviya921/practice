package InterviewQ.String;

public class blank_space_replace_1b {
    public static void main(String[] args) {

        // replace -- only remove the white space present in the sentence
        // but not tab or new line like - \n(represent the new line), \t(tab).

        java.lang.String name = "this is the \t test \n string";

        //StringBuilder st = new StringBuilder();

        java.lang.String replace = name.replace(" ","");
        java.lang.String replaceAll = name.replaceAll("\\s","");

        System.out.println(replace);
        System.out.println(replaceAll);

        System.out.println("------------------------------------");

        System.out.println("After replace(\" \", \"\"): ");
        System.out.println("\nAfter replaceAll(\"\\\\s\", \"\"): ");

        // here we are using the ESCAPE characters.
        // \" → prints a ".
        //
        //\\ → prints a single \.
        //
        //\\\\ → prints \\ (needed when we want to literally show \s).


    }
}
