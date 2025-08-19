package TryCatch;

public class test1 {
    public static void main(String[] args) {

        int[] a ={20,30,40,50};
        int[] b ={2,3,0,5};


        for(int i = 0; i<a.length; i++){
            try {
                System.out.println(a[i]/b[i]);
            } catch (ArithmeticException | NullPointerException e) { // we can't do like--> catch (ArithmeticException e1 | Exception e2)

                //throw new RuntimeException(e.getMessage()); --> this will terminate the program.

                System.out.println(e.getMessage());
                System.out.println("Error: Division by zero at index " + i+", where the no. is "+a[i]);
                System.out.println("this is to make the program run further");
            }
        }
        System.out.println("good JOB");

    }

//    public static int result(int a,int b){
//        return a/b;
//    }

}
