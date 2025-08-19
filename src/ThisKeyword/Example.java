package ThisKeyword;

public class Example {
    public void display() {
        System.out.println("This is the caller object: " + this);
    }
    int a = 69;


    public static void main(String[] args) {
        Example  car   = new Example();
        car.display(); // 'this' refers to the 'example' object
        System.out.println(car);
    }
}