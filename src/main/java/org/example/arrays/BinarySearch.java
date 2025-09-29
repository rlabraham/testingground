package org.example.arrays;

public class BinarySearch {
    //Recursive Binary search. Returns location the searchValue should be if now found
    static int binarySearch(int[] values, int start, int end, int searchValue) {
        if (start > end) return start; // Base case
        int mid = start + (end - start) / 2; // Find the midpoint
        if (values[mid] == searchValue) return mid; // Target found
        if (values[mid] > searchValue) // If the target is less than the midpoint
            return binarySearch(values, start, mid - 1, searchValue); // Search the left half
        return binarySearch(values, mid + 1, end, searchValue); // Search the right half
    }
}
