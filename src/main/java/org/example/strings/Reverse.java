package org.example.strings;

public class Reverse {
    public static String reverseString(final String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseStringNoSb(final String s) {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }

    public static String reverseUsingCharArrays(final String s) {
        char[] reversed = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed[s.length() - 1 - i] = s.charAt(i);

        }
        return new String(reversed);
    }

    public static void main(String[] args) {
        String test = "abcd";

        System.out.println(reverseUsingCharArrays(test));
    }
}
