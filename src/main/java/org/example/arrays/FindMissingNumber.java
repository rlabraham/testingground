package org.example.arrays;

public class FindMissingNumber {
    // Function to find the missing number
    static int missingNumberNative(int[] nums) {
        int n = nums.length + 1;

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            // If the current number is not present
            if (!found)
                return i;
        }
        return -1;
    }

    /**
     * The sum of the first n natural numbers is given by the formula (n * (n + 1)) / 2.
     * The idea is to compute this sum and subtract the sum of all elements in the array from it to get the missing number.
     **/
    static int missingNumberOptimal(int[] arr) {
        int n = arr.length + 1;

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        // Calculate the sum of the first n natural numbers
        int expectedSum = (n * (n + 1)) / 2;

        // Return the missing number
        return expectedSum - sum;
    }
}
