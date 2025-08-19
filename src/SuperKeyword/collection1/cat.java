package SuperKeyword.collection1;
public class cat extends animal {
   String catfood;
   public cat(){
        System.out.println("this is a no arg. constructor or child class");
    }

    public cat(int age, String name,String catfood){
        super(name,age);
        this.catfood=catfood;
        System.out.println("this is a child class constructor");
    }

    public void catFunction(){
    }

    // So this is how in the method override, we will use the super keyword to call the parent function.
    // Which obviously is present with the same name.
    @Override
    public void make_noise(){
        super.make_noise();
        System.out.println("This is the child class making noise -<>- MEOW-MEOW ");
        super.eat(); // we can call any method present in the super class using the super keyword
        eat(); // but as w know this method is not the overridden one so we can directly call it
        // in any method of the child class without the super keyword.

        // super.DoSomthingPrivate(); // this is not possible. because it is private.
   }

// note --> we can not call them directly we can call them in the mehtod of the child class.
// we can not call the methods present in the parent class in the main method like cat.super.eat this is not possible.
// we can not use the super keyword key to access the private methods present in the parent class. only public or the protected.
}
