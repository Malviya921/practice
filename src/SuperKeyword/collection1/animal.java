package SuperKeyword.collection1;
public class animal {
    String name;
    int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this is the parent constructor with argument");
    }

    // no arg. constructor of the super-class or parent class
    public animal(){
        System.out.println("this is the no-arg constructor");

    }

    public void eat(){
        System.out.println("this is the parent method 'EAT' ");
    }

    public void make_noise(){
        System.out.println("animal is making noises");
    }

    private void DoSomthingPrivate(){
        System.out.println("this is a private method");
    }

}
