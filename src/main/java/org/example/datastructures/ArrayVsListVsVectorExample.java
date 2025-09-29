package org.example.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * In Java, Array, Vector, and List are used to store elements, but they have several key differences:
 *
 * Array:
 * Size: Fixed size. Once created, the size of an array cannot be changed.
 * Synchronization: Not synchronized. Multiple threads can access an array simultaneously without any synchronization.
 * Performance: Faster due to the lack of synchronization overhead.
 * Usage: Suitable for scenarios where the size is known and does not change.
 * Methods: Does not provide built-in methods for common operations like adding or removing elements.
 *
 * Vector:
 * Size: Dynamic size. It can grow or shrink as needed.
 * Synchronization: Synchronized. It is thread-safe and can be used safely in a multi-threaded environment.
 * Performance: Slower because of synchronization overhead.
 * Usage: Suitable for scenarios where the size can change dynamically and thread safety is required.
 * Methods: Provides built-in methods for adding, removing, and accessing elements.
 *
 * List:
 * Size: Dynamic size. It can grow or shrink as needed.
 * Synchronization: Not synchronized by default. If thread safety is required, it must be synchronized externally.
 * Performance: Generally faster than Vector due to the lack of synchronization overhead.
 * Usage: Suitable for scenarios where the size can change dynamically.
 * Methods: Provides built-in methods for adding, removing, and accessing elements. List is an interface, and common implementations include ArrayList and LinkedList.
 */
public class ArrayVsListVsVectorExample {
    public static void main(String[] args) {
        // Array
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");

        // List
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
    }
}
