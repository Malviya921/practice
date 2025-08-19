package Object_initialization;

public class ObjectInitialization3 {
// Object Initialization by using Method
// here Instead of using the constructor we will use the method for the initialization of the variables.


    // declaring the variables.
    String name;
    int age;
    int pin;

    void mehtod4Initialization(String s,int a,int p){
        this.name=s;
        this.age=a;
        this.pin=p;
    }

    void mydeatils(){
        System.out.println("my name is "+name);
        System.out.println("my age is "+ age);
        System.out.println("my pin is "+pin);
    }

    public static void main(String[] args) {
        ObjectInitialization3 OI3 = new ObjectInitialization3();
        OI3.mehtod4Initialization("ravi",69,4001);
        OI3.mydeatils();

    }
}
