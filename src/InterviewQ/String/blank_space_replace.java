package InterviewQ.String;

public class blank_space_replace {
    public static void main(String[] args) {

        // space can be blank space [single or multiple], tab space(\t), newline space (\n)

        // here we have the single and multiple space
        String with_space = "this   is the first            sentence";
        // we gave long space but,will get replace.

        String without_space = with_space.replace(" ","");


        System.out.println("using the replace");
        System.out.println("with_space String --> " + with_space);
        System.out.println("without_space --> " + without_space);

    }
}
