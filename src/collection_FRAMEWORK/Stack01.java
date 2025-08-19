package collection_FRAMEWORK;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // we use the PUSH function in the stack

        animals.push("dog");
        animals.push("cat");
        animals.push("lion");
        animals.push("monkey");
        animals.push("mouse");

        System.out.println("stack:" + animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek());





    }
}
