package collection_FRAMEWORK;

import java.beans.PersistenceDelegate;

public class foreachloopARRAY {

        // Inner static class without constructor
        static class Person {
            String name;

            Person(){} // NON-Parametriz/default constructed to initialise the Object without the parameters

            Person(String name) {
                this.name = name;
            }

        }

        public static void main(String[] args) {
            // Create an array of Person objects
            Person[] batch1 = new Person[4];

            // Initialize and assign manually
            batch1[0] = new Person();
            batch1[0].name = "Ravi";

            batch1[1] = new Person();
            batch1[1].name = "Neha";

            batch1[2] = new Person();
            batch1[2].name = "Arjun";

            batch1[3] = new Person("ravi"); // to do this we need to add a pm constructor to it

            // Print the names using a for-each loop
            for (Person p : batch1) {
                System.out.println(p.name);
            }
        }
}

