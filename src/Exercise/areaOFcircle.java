package Exercise;

public class areaOFcircle {

   private int radius ;

     areaOFcircle(){
         this.radius=5;
     }
     areaOFcircle(int r){
         this.radius=r;
     }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void AREA_calculate(){
         double area = Math.PI*radius*radius;
         int areaa = (int) (Math.PI*radius*radius);
        System.out.println(area);
        System.out.println(areaa);

    }

    public static void main(String[] args) {
        areaOFcircle A = new areaOFcircle();
        areaOFcircle B = new areaOFcircle(2);
        A.setRadius(6);
        A.AREA_calculate();
        B.AREA_calculate();



    }








}
