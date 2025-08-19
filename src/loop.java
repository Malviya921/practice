//public class loop {
//    static int class10(int a, int b){
//        return a+b;
//    }
//    static float class10(float a,float b){
//        return a+b;
//    }
//
//
//
//
//    static int plusMethod(int x, int y) {
//        return x + y;
//    }
//
//    static double plusMethod(double x, double y) {
//        return x + y;
//    }
//
//    static String plusMethod(String a, String b){
//        return a + b;
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//        int a = 69;
//        int b = 71;
////        if (a < b) {               // this is if + do while loop
////            do {
////                System.out.print("a is less then b.\n");
////                a++;
////            }
////            while (a <= b);
////        } else {
////            System.out.println("a is not less then the b");}
////-------------------------------------------------------------------------------------------------------------
////             // switch statement ->
////                switch (a) {
////                    case 1:
////                        System.out.println("this is the first case");
////                    case 2:
////                        System.out.println("this is the second case");
////                    case 3:
////                        System.out.println("this is the third case");
////                    case 69:
////                        System.out.println("this is the 69th day");
////                    default:
////                        System.out.println("this is the default statement");
////                };
//
////        int x = 5;
////        int y = x--; // y is assigned 5 (the original value of x), then x becomes 4
////        int z = --x; // x becomes 3, then z is assigned 3
////        System.out.println("x: " + x); // Output: x: 3
////        System.out.println("y: " + y); // Output: y: 5
////        System.out.println("z: " + z); // Output: z: 3
//
////-------------------------------------------------------------------
//
////        int x = 5;
////        int y = x--;
////        int z = x;
////
////        System.out.println(x);
////        System.out.println(y);
////        System.out.println(z);
////---------------------------------------------------------------------
////        while (a>0){
////            System.out.println("this is no " + a);
////            a=a-10;
////        }
////        System.out.println("end of the loop");
////----------------------------------------------------------------------------
////        int dice = 1;
////        while (dice<=6){
////            if (dice<6){
////                System.out.println("this is a "+dice);
////            }else {
////                System.out.println("Yatzy!");
////            }
////            dice=dice+1;
////        }
////----------------------------------------------------------------------
////        int dicenum =1;
////        if (dicenum<6){
////            System.out.println("this is a "+dicenum);
////            while (dicenum<6){
////                System.out.println(dicenum);
////                dicenum++;
////            }
////        }
////----------------------------------------------------------------
////        int dic = 1;
////
////        while (dic<6) {
////            System.out.println("No Yatzy."+ dic);
////            dic = dic + 1;
////        }
////        System.out.println("yes Yatzy"+ dic);
////----------------------------------------------------------------------
//
////        int num = 10;
////
////        while (num>0){
////            System.out.println("this is "+ num);
////            num--;
////       }
////        System.out.println("let the show on");
//
//        //-------------------------------------------------------------------------
////        int numb = 10;
////        for (int i=10;i>=0;i=i-2){
////            System.out.println("this is "+ numb);  // here if we need to define numb-=2 OR use i
////            numb-=2;   // can not do like this numb=-2
////        }
////
//
//        //-----------------------------------------------------------------------
////        int sum = 0;
////        for (int i=0; i<=100; i += 2){
////            sum= sum+i;
////        }
////        System.out.println(sum);
////--------------------------------------------------------------------------
////        for (int i=0;i<2;i++){
////            System.out.println("this is the first iteration");
////
////            for (int j=0;j<3;j++){
////                System.out.println("nested loop");
////            }
////        }
//
////--------------------------------------------------------------------------
////        int[] rayHAI = {1,45,56,546,67,567,345};
////        for (int i: rayHAI){
////            System.out.println(i);
////        }
////        System.out.println(rayHAI.length);
//
////--------------------------------------------------------------------------
////        for (int i = 10; i <= 100; i += 10) {
////            System.out.println(i);
////        }
////
//////--------------------------------------------------------------------------
////        for (int i = 0; i <= 10; i +=2) {
////            System.out.println(i);
////        }
//
////--------------------------------------------------------------------------
////        int i = 2;
////        for (int j =1 ; j <= 10 ; j++) {
////            System.out.println(i +"x"+j+"="+(i*j) );
////
////        }
//
////--------------------------------------------------------------------------
//
////        int i = 0;
////        while (i < 10) {
////            if(i==4){
////                i++;
////                continue;}
////            System.out.println(i);
////            i++;
////        }
////--------------------------------------------------------------------------
////        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
////        cars[0] = "TATA";
////        System.out.println(cars[0]);
////        System.out.println(cars.length);
////        Arrays.sort(cars);
//
//
////        Integer[] numbers = {5, 2, 8, 1, 9, 4};
////        int[] numbr = {4,5,556,45,34,534,543,646,556,43};
////        Arrays.sort(numbr);
////        System.out.println(Arrays.toString(numbr));
////
////        Arrays.sort(numbers, Collections.reverseOrder()); // this does not work on the permitive data type.
////        System.out.println(Arrays.toString(numbr));
//
////--------------------------------------------------------------------------
//       // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
////        float avg;
////        int sum=0;
////
////        for (int i =0; i < ages.length; i++) {
////            sum=sum+i;
////        }
////        avg=sum/ages.length;
////
////        System.out.println(avg);
////--------------------------------------------------------------------------
////        int lowest = ages[0];
////        for (int i = 0; i < ages.length; i++) {
////            if (lowest > ages[i]) {
////                lowest = ages[i];
////            }
////        }
////        System.out.println(lowest);
//
////--------------------------------------------------------------------------
////        int lowest = ages[0];
////        for (int age : ages) {
////            if (lowest>age){
////                lowest=age;
////            }
////        }
////        System.out.println(lowest);
//--------------------------------------------------------------------------
////        int z = class10(69,"45");
////        System.out.println(z);
////
////        float zx = class10(43.34,563.44);
////        System.out.println(zx);
//
////        String s = plusMethodDouble("prince", "saini");
////        System.out.println(s);
////
////        int abc = plusMethod(34,54);
////double dbl = plusMethod(534.5,534.56);
////String str = plusMethod("prince", "saini");
////
////        System.out.println("abc"+"dbl"+"str");
//
//
//
//
//
//
//
//    }
//}
//
//
//
