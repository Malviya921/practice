package PassbyVALUEobject;

public class passReference {

    static void passReference(EmployeeTest emp) {

//        EmployeeTest reference = emp;   //we can go further without assigning the reference of the object to a variable
//        System.out.println(reference);  // just by using the object as parameter variable name --> "emp" in this case.

        System.out.println(emp);
        System.out.println("the value of name property of our object is " + emp.getName());  // reference.getName()

        emp.setName("Bond");

    }

    public static void main(String[] args) {
        EmployeeTest ref = new EmployeeTest(); // here we needed to assign a reference variable because we neded to use the
        // getter and setter to get and set the values.
        ref.setName("James");

        passReference(ref);
        System.out.println("Value of property of object after reference get passed to method is "+ ref.getName());
        System.out.println();

    }
}