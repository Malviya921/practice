package Object_initialization;

public class ObjectInitialization1 {
// Object Initialization by using Constructor

    // declaring the variables.
    String name;
    int age;
    int pin;
    // initialization using the constructor.
    ObjectInitialization1(){
        name="ravi";
        age=69;
        pin=4001;
    }
    // creating a method
    void printdetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(pin);
    }
    public static void main(String[] args) {
        // created an object of the class
        ObjectInitialization1 OI = new ObjectInitialization1();
        // we can directly access the declared variables Using the Object Reference
        System.out.println(OI.name);
        System.out.println(OI.age);
        System.out.println(OI.pin);
// or we can call the mehtod presrnt in the calss
        OI.printdetails();
    }
}
