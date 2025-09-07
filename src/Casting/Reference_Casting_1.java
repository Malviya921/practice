package Casting;

public class Reference_Casting_1 {
    static void main() {
        // Reference casting
        // 1. upcasting (automatic)
        // 2. Down-casting (explicit)

        // simple example
        Object obj = "Hello";   // upcasting (automatic) Object of the parent class
        String str = (String) obj; // down-casting (explicit) put into the reference of the child class

        // note -  every class is a child class of the OBJECT class in java.


        //  Animal (parent class)  Dog & Cat (child classes)

//        Animal myAnimal = new Dog;  (upcasting);
//
//        Dog mydog = (Dog) myAnimal; (Explicit downcasting)
//        OR
//        Dog mydog = (Dog) mycat; (Explicit downcasting)




    }
}
