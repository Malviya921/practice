package wrapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class wrapping3 {
    // Variable arguments
    public static void printNames(String... names) {
        System.out.println("Number of names received: " + names.length);
        for (String name : names) {
            System.out.println(name);
        }
    }


            public static void main(String[] args) {
                // Calling the method with a variable number of arguments
                printNames("Alice", "Bob");
                printNames("Charlie", "David", "Eve");
                printNames(); // Calling with no arguments
            }
        }