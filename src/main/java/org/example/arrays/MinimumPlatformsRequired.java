package org.example.arrays;

import java.util.Arrays;

public class MinimumPlatformsRequired {
    /**
     * We are given two arrays that represent the arrival and departure times of trains,
     * the task is to find the minimum number of platforms required so that no train waits.
     **/

    // Returns minimum number of platforms required. Assume trains sorted by arrival time.
    public static int findPlatformNative(int[] arr, int[] dep) {

        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;

        // run a nested  loop to find overlap
        for (int i = 0; i < arr.length; i++) {
            // minimum platform
            plat_needed = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    // check for overlap. arrives before it departs & departs after it arrives
                    if (arr[i] <= dep[j] && dep[i] >= arr[j]) {
                        plat_needed++;
                    }
                }
            }

            // update result
            result = Math.max(result, plat_needed);
        }

        return result;
    }

    // Returns minimum number of platforms required
    static int findPlatformOptimal(int[] arr, int[] dep)
    {
        // Sort arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < arr.length && j < arr.length) {
            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }

            // Else decrement count of platforms needed
            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }

            // Update result if needed
            if (plat_needed > result)
                result = plat_needed;
        }

        return result;
    }
}
