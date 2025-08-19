public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // This constructor has one parameter, <i>name</i>.
        System.out.println("Name chosen is :" + name );
    }

    public void setAge( int age ) {
        puppyAge = age;
    }

    // here we have created a getter and setter this get is not void type so it is return type, we can assign it to a variable in the main.
    // but we can meke it non-return type by using the void
    public int getAge( ) {
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }

    public static void main(String []args) {
        /* Object creation */
        Puppy myPuppy = new Puppy( "tommy" );

        /* Call class method to set puppy's age */
        myPuppy.setAge(69);

        /* Call another class method to get puppy's age */
        myPuppy.getAge( );

        // here we have assigned the return type to the new variable.
        int age= myPuppy.getAge();
        System.out.println(age);

        /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge );

//        Puppy p1 = new Puppy("adam");
//        p1.setAge(69);
//        int age=p1.getAge();
//        System.out.println(age);
    }
}