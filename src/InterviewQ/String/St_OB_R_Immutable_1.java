package InterviewQ.String;

public class St_OB_R_Immutable_1 {

    public static void main(String[] args) {

        // using the concat and System.identityHashCode comparison to check

        String str = "ravi"; // string object
        System.out.println(str);
        System.out.println("hashCode b4 concat "+ System.identityHashCode(str));


       // String str2 = str.concat(" saini");

        str = str.concat(" prince");
        System.out.println(str);

        System.out.println("hashCode after concat "+ System.identityHashCode(str));

        System.out.println(str);

    }
}
