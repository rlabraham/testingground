package org.example.arrays;

public class MaxProductSubArray {
    static int maxProductNative(int arr[]) {
        // Initializing result
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int mul = 1;

            // traversing in current subarray
            for (int j = i; j < arr.length; j++) {
                mul *= arr[j];

                // updating result every time
                // to keep track of the maximum product
                result = Math.max(result, mul);
            }

            //int[] a = new int[arr.length - i];
        }
        return result;
    }

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    // Function to find the product of max product subarray
    static int maxProductOptimal(int[] arr) {
        // max product ending at the current index
        int currMax = arr[0];

        // min product ending at the current index
        int currMin = arr[0];

        // Initialize overall max product
        int maxProd = arr[0];

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {

            // Temporary variable to store the maximum product ending
            // at the current index
            int temp = max(arr[i], arr[i] * currMax, arr[i] * currMin);

            // Update the minimum product ending at the current index
            currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin);

            // Update the maximum product ending at the current index
            currMax = temp;

            // Update the overall maximum product
            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }
}
