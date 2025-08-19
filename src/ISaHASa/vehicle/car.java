package ISaHASa.vehicle;

// here fourWheeler is having IS-A relationship with vehicle class.
// and HAS_A relationship with the speed,engine,musicSystem class.

class car extends Vehicle {
    private Speed myspeed; //where a reference variable is declared like --> private int age;
    // without instantiating the object right away,
    // is often referred to as "Lazy Initialization"

// Now getter and setter methods are used to access and update the private fields (variables) of a class.
    public Speed getMyspeed() {
        return myspeed;
    }

    public void setMyspeed(Speed x) {  // taking the variable of speed class as input/argument
        this.myspeed = x;
    }

    //    public Speed getSpeed() {
//        return myspeed;
//    }
//
//    public void setSpeed(int a) {
////        this.speed = speed;
//    }

    public void print() {
        System.out.println("4WHEELER: " +this.getName() + ", Max Speed: " + myspeed.getMax() );
    }
}