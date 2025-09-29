package org.example.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    /**
     * Given an array arr[] of size n, find all the Leaders in the array.
     * An element is a Leader if it is greater than or equal to all the elements to its right side.
     * The rightmost element is always a leader.
     */

    static ArrayList<Integer> leadersNative(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int j;

            // Check elements to the right
            for (j = i + 1; j < arr.length; j++) {

                // If a larger element is found
                if (arr[i] < arr[j]) { break; }
            }

            // If no larger element was found
            if (j == arr.length) { result.add(arr[i]); }
        }

        return result;
    }

    static ArrayList<Integer> leadersOptimal(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        // Start with the rightmost element
        int maxRight = arr[arr.length - 1];

        // Rightmost element is always a leader
        result.add(maxRight);

        // Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }

        // Reverse the result list to maintain
        // original order
        Collections.reverse(result);

        return result;
    }

}
