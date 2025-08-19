package SuperKeyword.collection3;

class SuperKey {
    int A;


    public SuperKey(int a) {
        A = a;
    }

    public SuperKey(){
        this(69);
    }


    public void assign(int x){
        A=x;
        System.out.println("this is a super method");
    }
}
