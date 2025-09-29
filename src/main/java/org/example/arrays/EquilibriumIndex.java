package org.example.arrays;

public class EquilibriumIndex {
    /**
     * Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index exists.
     * The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes.
     */

    static int findEquilibriumNative(int[] arr) {

        // Check for indexes one by one until
        // an equilibrium index is found
        for (int i = 0; i < arr.length; ++i) {
            // Get left sum
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Get right sum
            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            // If leftsum and rightsum are same, then
            // index i is an equilibrium index
            if (leftSum == rightSum) {
                return i;
            }
        }

        // If equilibrium index doesn't exist
        return -1;
    }

    static int equilibriumPointOptimal(int[] arr) {
        int prefSum = 0, total = 0;

        // Calculate the array sum
        for (int ele : arr) {
            total += ele;
        }

        // Iterate pivot over all the elements of the array
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }

        // There is no equilibrium point
        return -1;
    }

}
