package InterviewQ;

public class ReverseTHEstring2 {

    // using the String-Builder
    static void main() {

        String str = "hi my name is Ravi";

        StringBuilder sb = new StringBuilder(str);
        // reversing the string
        sb.reverse();
        String new_one = String.valueOf(sb);
        System.out.println(new_one);

        System.out.println("\n---------------\n");

        // reversing it again
        String new_one2 = new StringBuilder(new_one).reverse().toString();
        System.out.println(new_one2);




    }
}
