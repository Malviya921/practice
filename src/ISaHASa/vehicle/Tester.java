package ISaHASa.vehicle;

public class Tester {

    public static void main(String[] args) {
        Speed speed = new Speed();
        speed.setMax(120);

        car car = new car();

        car.setName("thar");
        car.setMyspeed(speed);
        car.print();
       // car.
    }
}