public class Variable_Argument {
    // variable Arguments
    // The syntax is always --> dataType... variableName.
    // For example:
    //•	String... names --> can accept the multiple string arguments --> String[] names
    //•	int... numbers --> can accept the multiple int arguments --> int[] number
    //•	Object... items --> can accept the multiple Object arguments of any object type defined. --> Object[] items
    // in the background what really happens is that it treat it as an array of the given data type.



    public static void println(String... name) {
        for (String st : name) {
            System.out.println(st);
        }
    }


    static void main() {
     //   System.out.println("ravi","saini");// --> this is not going to work because
        // the println has no overload that accepts two String arguments.
        System.out.println("ravi"+" saini"); // so we need to concate or write multiple print statement
        System.out.println("ravi");
        System.out.println("saini");
        System.out.println("____________________");
        // or need to create out own print mehtod which can take varargu--> like above
        // new let's call our println

        println("ravi","saini");




    }
        }