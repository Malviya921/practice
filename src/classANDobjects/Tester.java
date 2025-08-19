package classANDobjects;

public class Tester {

    public static void main(String[] args) {
        int a = 11;
        int b = 6;

        Util util = new Util();

        int c = util.minimum(a, b);
        System.out.println("Minimum Value = " + c);
    }
}