package PassbyVALUEobject;

public class PassByValue {

    // here we are passing the value by


    static int k = 10;
    static String name = "ravi";


    static void passPrimitive(int j) {
        System.out.println("the value of passed primitive is " + j);
        j = j + 1;
        System.out.println(j);
    }

    static void callbyvalue(String x) {
        System.out.println("the name is " + x);
        x = x + " saini";
        System.out.println(x);
    }

    public static void main(String[] args) {
        // Calling a method which takes integer as input and increase it by one inside the method only.
        // and then print its value and the method ends
        passPrimitive(k);

        //Now we print the value of the instant variable which we gave to the method, it remains unchanged.
        // it is outside the --> passPrimitive <-- method.
        System.out.println(k);

        // same thing happened to the string as well.
        callbyvalue(name);
        System.out.println(name);
    }
//as the loop ends the value which were changed by the function, gets Diminished.
// and the values which we passed as the parameter remain as it is, as we have assigned them in the Beginning of the class.
    // they are called as Static Variables.

    // even though String is not a permitive data type why its value is not changing?
}