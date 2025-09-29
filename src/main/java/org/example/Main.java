package org.example;

public class Main {
    public static void main(String[] args) {
        int[] odd = {1, 2, 3};
        int[] even = {1, 2, 3, 4};

        System.out.println("foo");
    }

    /*Take an array of Integers, reverse [12][21] [1,2,3]. Without using another array
     */

    public static int[] reversIntArray(final int[] arr) {
        if (arr.length > 1) {
            int leftPointer = 0;
            int rightPointer = arr.length - 1;

            while (leftPointer < rightPointer) {
                int a = arr[leftPointer];
                int b = arr[rightPointer];

                arr[leftPointer] = b;
                arr[rightPointer] = a;

                leftPointer++;
                rightPointer--;
            }
        }

        return arr;
    }
}
