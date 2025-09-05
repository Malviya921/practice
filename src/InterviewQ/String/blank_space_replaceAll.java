package InterviewQ.String;

public class blank_space_replaceAll {
    public static void main(String[] args) {

        String with_space = "this   is \t the \n first            sentence";

        String without_space = with_space.replaceAll("\\s","");

        // Here--> \\s is a regex that matches any whitespace (spaces, tabs, newlines).

        System.out.println("using the replaceALL");
        System.out.println("with_space String --> " + with_space);
        System.out.println("without_space --> " + without_space);

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
