public class Main {
    public static void modifyPrimitive(int x) {
        x = x * 2;
        System.out.println("Inside modifyPrimitive: " + x); // Output: Inside modifyPrimitive: 20
    }

    public static void modifyObject(MyClass obj) {
        obj.setValue(obj.getValue() * 2);
        System.out.println("Inside modifyObject: " + obj.getValue()); // Output: Inside modifyObject: 20
    }

    public static void reassignObject(MyClass obj) {
        obj = new MyClass(100);
        System.out.println("Inside reassignObject: " + obj.getValue()); // Output: Inside reassignObject: 100
    }

    public static void main(String[] args) {
        int num = 10;
        MyClass myObj = new MyClass(10);

        modifyPrimitive(num);
        System.out.println("After modifyPrimitive: " + num); // Output: After modifyPrimitive: 10

//        modifyObject(myObj);
//        SystemAfter modifyObject: 20

        reassignObject(myObj);
        System.out.println("After reassignObject: " + myObj.getValue()); // Output: After reassignObject: 20
    }
}