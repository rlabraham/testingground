package org.example.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UncommonWords {
    public static String[] uncommonFromSentences(String s1, String s2) {
        final List<String> words1 = new ArrayList<>(Arrays.asList(s1.split(" ")));
        final List<String> words2 = new ArrayList<>(Arrays.asList(s2.split(" ")));
        final List<String> uncommonWords = new ArrayList<>();

        for (String word : words1) {
            if (words2.contains(word)) {
                words1.remove(word);
            }
            words2.remove(word);
        }

        uncommonWords.addAll(words1);
        uncommonWords.addAll(words2);

        return uncommonWords.toArray(new String[0]);
    }
}
