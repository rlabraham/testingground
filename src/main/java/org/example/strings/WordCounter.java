package org.example.strings;

import java.util.HashMap;

public class WordCounter {
    public static HashMap<String, Integer> wordCount(final String text) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
