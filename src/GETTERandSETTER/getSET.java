package GETTERandSETTER;

public class getSET {
    private String a;

    public String getthevalue() {
        return a;
    }

    public void setthevalue(int a) {
        this.a = String.valueOf(a);
    }


    public static void main(String[] args) {
          getSET GETandSET = new getSET();
        GETandSET.setthevalue(69);
        String b = GETandSET.getthevalue();
        System.out.println(b);
    }



}
