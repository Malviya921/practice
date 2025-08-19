public class constructor {

    // there is a constructor class having attributes defined
    int x;
    int y;
    int z;
// here we have declared the variable but did not create any constructor
    //Java provides a default constructor that initializes the object.

//    public static void main(String[] args) {
//        constructor cc = new constructor();
//        System.out.println(cc.x);
//        System.out.println(cc.y);
//        System.out.println(cc.z);
//    }

 //-----------------------------------------------

    // creating a no argument constructor OR non parametrise.
    public constructor() {
        int x = 0;
        int y = 0;
        int z = 0;
    }

    // this is a parametrised constructor.
    public constructor(int a,int b,int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }

    void printDetails(){
        System.out.println(x);
        System.out.println(this.y);  // we can define like that too.
        System.out.println(z);
    }

    public static void main(String[] args) {
        constructor c1 = new constructor();
        constructor c2 = new constructor(32,24,234);
        c1.printDetails();
        c2.printDetails();
    }
}
