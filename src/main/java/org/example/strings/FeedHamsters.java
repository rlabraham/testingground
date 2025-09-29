package org.example.strings;

/*You are given a 0-indexed string hamsters where hamsters[i] is either:
'H' indicating that there is a hamster at index i, or
'.' indicating that index i is empty.

You will add some number of food buckets at the empty indices in order to feed the hamsters.
A hamster can be fed if there is at least one food bucket to its left or to its right.
More formally, a hamster at index i can be fed if you place a food bucket at index i - 1 and/or at index i + 1.
Return the minimum number of food buckets you should place at empty indices to feed all the hamsters or -1 if it is impossible to feed all of them.*/
public class FeedHamsters {
    /*At any given hamster index i, we check if it's possible to place a food bucket to the right (i + 1) since this will also serve a potential hamster at index i + 2.
Otherwise, we place a food bucket to the left i -1. In all other cases, a solution is not possible.*/
    public int hamsterSolution(String hamsters) {
        if(hamsters.equals("H")) {
            return -1;
        }
        if(hamsters.equals(".")) {
            return 0;
        }
        int n = hamsters.length();
        char[] hamstersArr = hamsters.toCharArray();
        int minBuckets = 0;
        for (int i = 0; i < n; i++) {
            if (hamstersArr[i] == 'H') {
                if (i  < n - 1 && hamstersArr[i + 1] == '.') {
                    // Place bucket to the right of the hamster
                    minBuckets++;
                    i += 2; // Skip next index because this bucket can serve the next hamster too
                } else if (i > 0 && hamstersArr[i - 1] == '.') {
                    // Place bucket to the left of the hamster if not already served
                    minBuckets++;
                } else {
                    return -1;
                }
            }
        }
        return minBuckets;
    }
}
