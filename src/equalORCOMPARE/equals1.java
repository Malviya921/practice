package equalORCOMPARE;

public class equals1 {
    // in java Using == operator OR (Double equals operator).
    // Using equals() method.
    // Using compareTo() method.
    // Using compareToIgnoreCase() method.
    // Using compare() method.




    public static void main(String[] args) {
        String s1="ravi";  // s1 & s2 holds the actual value
        String s2="ravi";

        String s3 = new String();
        String s4 = new String();  // s3 & s4 are the reference to the memory location that has the object.


// In case of any Primitive data type their variable hold the actual value so when we use double equal method
// it turns out to be true , like in the case of s1 and s2.
        if (s1==s2){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("string are not equal");
        }


        if (s1.equals(s2)){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("string are not equal");
        }


//Here in the case of S3 aNd S4, we created new string objects using the new String method.
// So here in this way we created two objects at the different memory locations,
// S3 and S4 are the variables assigned to those objects.
// they do not hold the actual value they just refer them to the memory location where those two object were being created.
        // so double[==] equal fails

        if (s3==s4){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("string are not equal");
        }


        if (s3.equals(s3)){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("string are not equal");
        }


    }


}
