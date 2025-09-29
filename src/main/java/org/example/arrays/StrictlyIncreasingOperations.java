package org.example.arrays;

public class StrictlyIncreasingOperations {

    /*
    You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.

    For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
    Return the minimum number of operations needed to make nums strictly increasing.

    An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1. An array of length 1 is trivially strictly increasing.*/

    public static int minOperations(int[] nums) {
        int operations = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];

            if (diff <= 0) {
                int operationsNeeded = (-1 * diff) + 1;

                operations = operations + operationsNeeded;
                nums[i + 1] = nums[i + 1] + operationsNeeded;
            }
        }

        return operations;
    }
}
