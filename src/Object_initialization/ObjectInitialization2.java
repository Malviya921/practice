package Object_initialization;

public class ObjectInitialization2 {
//Object Initialization by using Reference variable , using dot notation.

    // declaring the variables.
    String name;
    int age;
    int pin;

    public static void main(String[] args) {
        ObjectInitialization2 OI2=new ObjectInitialization2();
        OI2.name = "ravi";
        OI2.age = 69;
        OI2.pin = 4001;

        String details = OI2.name +"_"+ OI2.age +"_"+ OI2.pin;
        System.out.println(details);
        System.out.println("my name is "+OI2.name);
        System.out.println("my age is "+ OI2.age);
        System.out.println("and my pin is "+ OI2.pin);
        // Need to use the object reference because the declared variables are not static

    }
}
