package SuperKeyword.collection3;

public class SubClass extends SuperKey {

    int A;


    public SubClass(){
     this(69);
    }

    public SubClass(int x){
        A=x;
        System.out.println("this is a subclass constructor");
    }


    public void assign(int x){
        A=x;
        System.out.println("this is a subclass method");
    }

}
