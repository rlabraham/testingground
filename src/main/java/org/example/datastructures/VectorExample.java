package org.example.datastructures;

import java.util.Vector;

/**
 * A Vector is a synchronized, dynamic array that can grow or shrink in size as needed.
 * It is part of the java.util package and implements the List interface.
 * Vector is similar to ArrayList, but it is synchronized, making it thread-safe.
 * However, due to its synchronization overhead, it is generally slower than ArrayList.
 **/
public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");

        // Access elements from the Vector
        System.out.println("First element: " + vector.get(0));
        System.out.println("Second element: " + vector.get(1));

        // Remove an element from the Vector
        vector.remove(1);

        // Iterate over the elements in the Vector
        for (String element : vector) {
            System.out.println("Element: " + element);
        }
    }
}
