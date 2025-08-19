package GETTERandSETTER;

public class EXERCISE {

   private int age;
   private String name;

    public void getAge(){
        System.out.println(age);
    }
    public String getName(){
        System.out.println(name);
        return name;
    }


    public void setAge(int X){
        this.age=X;
    }
    public void setName(String X){
        this.name=X;
    }

    public static void main(String[] args) {
        EXERCISE ex = new EXERCISE();
        ex.setAge(69);
        ex.setName("ravi");
        ex.getAge();
        ex.getName();
    }

}
