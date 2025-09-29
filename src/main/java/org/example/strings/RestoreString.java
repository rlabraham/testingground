package org.example.strings;

public class RestoreString {
    public static String restoreString(String s, int[] indices) {
        char[] sortedString = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            sortedString[indices[i]] = s.charAt(i);
        }

        return String.valueOf(sortedString);
    }
}
