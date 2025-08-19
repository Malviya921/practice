package ISaHASa.vehicle;

//In this example, we're creating few classes like Vehicle, Speed.
// A fourWheeler class is defined which extends Vehicle class and has a Speed class object.
// fourWheeler class inherits properties from Vehicle class and Speed being its property,
// we're passing it from caller object. In output, we're printing the details of Van object.


public class Vehicle {
    private String name;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
