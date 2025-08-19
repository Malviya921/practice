package TryCatch;

public class try_catch2 {
        public static void main(String args[]) {
            try {
                int []a = new int[2]; // this is new/Recommended  way.
           //     int a[] = new int[2]; // this is old way. but both are correct to declare an array in Java
                System.out.println("Access element three :" + a[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown  :" + e);
            }
            System.out.println("Out of the block");
        }
    }
