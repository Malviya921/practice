public class overloading2 {

    // this is overloading by changing the parameter data type, changing the number of arguments.
    static void myD(String a,String b){
        System.out.println("this is the overloading "+a+" and "+b);
    }
    static void myD(String a,String b,String c){
        System.out.println("this is the overloading "+a+" and "+b);
    }
//------------------------------------------------------------------------------------------
// this is overloading by changing the data type of arguments.

    static void myD(String a){
        System.out.println("this is the overloading "+a);
    }

    static void myD(int a){
        System.out.println("this is the overloading "+a);
    }


    public static void main(String[] args) {
        myD(15);
        myD("prince");
        myD("prince","saini");
        myD("ravi","saini","malviya");




    }




}
