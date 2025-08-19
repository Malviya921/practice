package ThisKeyword;

class example2 {

    //--> "this"  <--
    // In this example we will see the use of --> "this"  <--
    //hIn the function set value we use this dot value in this case this returns us or represent us the instance variable and set it's value
    //And in the next line we used return this in this case this represent the current object of the example class
    //So in the main method if you want to store the value of The return function we need to use a container or a reference variable of the same object type
    //That is why we created a reference variable name result and the data type is same as the return function. which is returning the current
    // object of the example class.
    // and the return function is of the examole type not string,int etc.


    int value;

    example2 setValue(int value) {
        this.value = value;
        return this; // Returns the current object
    }

    public static void main(String[] args) {
        System.out.println(new example2().setValue(76));

        example2 ex = new example2();
        example2 result = ex.setValue(4578);
        System.out.println(result);




    }

}
