package InterviewQ.Exercise;

class Circle {
    int radius;

    Circle(){
        System.out.println("i am a non parametrize constructor");
    }

    Circle(int a){
        this.radius=a;
        System.out.println("i am a parametrize constructor of circle with param "+a);
    }
    void area(){
        System.out.println(Math.PI*radius*radius+" is area of a circle with radius "+ radius);
    }
}
// -------------------------------------------------------------
class Cylinder extends Circle {
    int height;

    Cylinder(int a,int b){
        super(a);
        this.height=b;
        System.out.println("i am a parametrize constructor of cylinder");
    }
    void volume(){
        System.out.println(Math.PI*radius*radius*height+"\n is the volume of a cylinder with radius "
                + radius+" and height "+height);

    }
}


public class Volume {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 2;
        c.area();
        System.out.println();
        Cylinder c1 = new Cylinder(1,9);
        c1.volume();

    }
}
