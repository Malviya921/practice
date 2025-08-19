package equalORCOMPARE;

public class equals2 {

    //There are many ways to compare two Strings in Java:
    //•	Using == operator
    //•	Using equals() method
    //•	Using compareTo() method
    //•	Using compareToIgnoreCase() method
    //•	Using compare() method
// we have learnt about the .equal and double equal. in the equals class



    //• Using equalsIgnoreCase() method
    //The equalsIgnoreCase() method in Java is used to compare two strings, ignoring the case of the characters.
    // It returns true or false if it matches or not.
    public static void main(String[] args) {


        String a = "ravi";
        String b = "RAVI";
        String c = new String("RaVi");

        boolean result1 = a.equalsIgnoreCase(b); // true
        boolean result2 = a.equalsIgnoreCase(b); // true
        boolean result3 = b.equalsIgnoreCase(c); // true

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
