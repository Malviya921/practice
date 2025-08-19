package Object_initialization;

public class ObjectInitialization3b {
// area of a rectangle
    // declaring the variables
    int length;
    int breadth;

    void assign(int a,int b) {
        length = a;
        breadth = b;
    }
        void area(){
            int area = length*breadth;
            System.out.println(area);
        }

        void parameter(){
        int parameter = 2*(length+breadth);
            System.out.println(parameter);
    }

    public static void main(String[] args) {
        ObjectInitialization3b fresh =new ObjectInitialization3b();
        fresh.assign(34,65);
        fresh.area();
        fresh.parameter();
    }


}
