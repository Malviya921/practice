package ThisKeyword;

class This_Example2 {
    private int x;
    private int y;

    public This_Example2(int x, int y) {
        this.x = x; // Using 'this' to differentiate instance variable 'x' from parameter 'x'
        this.y = y; // Using 'this' to differentiate instance variable 'y' from parameter 'y'
    }

    public This_Example2() {
        this(0, 0); // Using 'this' to call another constructor
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x; // Explicitly using 'this' is optional here
    }

    public This_Example2 returnThis() {
        return this; // Returning the current object instance
    }

    public static void main(String[] args) {
        This_Example2 example = new This_Example2(5, 10);
        System.out.println(example.getX()); // Output: 5

        example.setX(20);
        System.out.println(example.getX()); // Output: 20

        This_Example2 sameExample = example.returnThis();
        System.out.println(sameExample.getX()); // Output: 20
    }
}