package org.example.strings;

public class IsPalindrome {
    public static boolean isPalindromePointer(String s) {
        if (s == null || s.length() < 2) { return true; }

        s = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePointer("rar")); // true
        System.out.println(isPalindromePointer("raccar")); // true
        System.out.println(isPalindromePointer("racecar")); // true
        System.out.println(isPalindromePointer("hello")); // false
        System.out.println(isPalindromePointer("a")); // true
        System.out.println(isPalindromePointer("")); // true
    }
}
