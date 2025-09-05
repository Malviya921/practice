package InterviewQ.String;

public class blank_space_replace_1 {
    public static void main(String[] args) {
        // String with spaces, tabs, and newlines
        // \n(represent the new line)
        // \t(tab).

        String str = "Java Program \t with  spaces \n and new line";

        System.out.println("Original String:");
        System.out.println(str);

        // Using replace (removes only spaces ' ')
        String onlySpacesRemoved = str.replace(" ", "");

        // Using replaceAll with regex \s (removes all whitespace: space, tab, newline, etc.)
        String allWhitespaceRemoved = str.replaceAll("\\s", "");

        System.out.println("\nAfter replace(\" \", \"\"): ");
        System.out.println(onlySpacesRemoved);

        System.out.println("\nAfter replaceAll(\"\\\\s\", \"\"): ");
        System.out.println(allWhitespaceRemoved);
    }
}
