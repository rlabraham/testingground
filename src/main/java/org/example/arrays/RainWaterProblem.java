package org.example.arrays;

public class RainWaterProblem {
    /**
     * Trapping Rainwater Problem states that given an array of n non-negative integers arr[]
     * representing an elevation map where the width of each bar is 1,
     * compute how much water it can trap after rain.
     **/

    // O(n^2) Time and O(1) Space
    static int maxWaterNative(int[] arr) {
        int res = 0;

        // For every element of the array
        for (int i = 1; i < arr.length - 1; i++) {

            // Find the maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);

            // Find the maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);

            // Update the maximum water
            res += Math.min(left, right) - arr[i];
        }

        return res;
    }

    // O(n) Time and O(1) Space
    static int maxWaterOptimal(int[] arr) {
        int left = 1;
        int right = arr.length - 2; // n-2

        // lMax : Maximum in subarray arr[0..left-1]
        // rMax : Maximum in subarray arr[right+1..n-1]
        int lMax = arr[0]; // first element
        int rMax = arr[right + 1]; // last element

        int res = 0;
        while (left <= right) {

            // If rMax is smaller, then we can decide the amount of water for arr[right]
            if (rMax <= lMax) {

                // Add the water for arr[right]
                res += Math.max(0, rMax - arr[right]);

                // Update right max
                rMax = Math.max(rMax, arr[right]);

                // Update right pointer as we have decided the amount of water for this
                right -= 1;
            } else {

                // Add the water for arr[left]
                res += Math.max(0, lMax - arr[left]);

                // Update left max
                lMax = Math.max(lMax, arr[left]);

                // Update left pointer as we have decided water for this
                left += 1;
            }
        }
        return res;
    }
}
