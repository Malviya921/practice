package InterviewQ.String;

public class String_builder {
    public static void main(String[] args){

        // String-Builder ?
        // StringBuilder in Java is a class used to create a mutable (changeable) sequence of characters.

        StringBuilder sb1 = new StringBuilder("This is the string as input -->"); // this is while creating the object.
        System.out.println(sb1);

        // we can mutate the SB object
        sb1.append(" 1st append ");
        System.out.println(sb1);
        System.out.println(sb1.reverse());
        System.out.println(sb1.delete(15,30));

        System.out.println("\n ----------------------------------- \n");

        StringBuilder sb2 = new StringBuilder();
        sb2.append("This is after creating the string builder object");
        System.out.println(sb2);

        // String st = sb2; ->  we can not assign the string builder to the String.

        String st1 = sb2.toString(); // we need to convert the string builder object to the string object type.
        System.out.println(st1);




    }
}
