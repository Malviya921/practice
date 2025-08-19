public class overloading {

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static float plusMethod(float x,float y){
        return x+y;
    }


    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        float myNum3 = (float) (float) plusMethod(34.54,543.4);
        double myNum4 = plusMethod(34.4,43.9);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("float: "+myNum3);
    }
}
