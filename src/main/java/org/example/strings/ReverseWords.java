package org.example.strings;

public class ReverseWords {
    public static final String reverseWords (final String words) {
        String[] wordsArray = words.split(" ");
        String reversedWords = "";

        if (wordsArray.length >= 1) {
            reversedWords = wordsArray[wordsArray.length - 1];

            for (int i = wordsArray.length - 2; i >= 0; i--) {
                reversedWords += " " + wordsArray[i];
            }
        }

        return reversedWords;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(""));
        System.out.println(reverseWords("Hello"));
        System.out.println(reverseWords("Hello World"));
        System.out.println(reverseWords("The quick brown fox"));
    }
}
