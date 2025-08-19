package ThisKeyword;

class This_Example3 {
    private int value;

    // Constructor
    public This_Example3(int value) {
        // Using "this" to differentiate instance variable from parameter
        this.value = value;
    }

    // Method to set the value
    public void setValue(int value) {
        // Using "this" to differentiate instance variable from parameter
        this.value = value;
    }

    // Method to get the value
    public int getValue() {
        return this.value; // Optional use of "this"
    }

    // Another constructor calling the first one
    public This_Example3() {
        this(0); // Using "this" to call another constructor
    }


    public static void main(String[] args) {
        This_Example3 obj = new This_Example3();
        System.out.println(obj.getValue());

    }
}