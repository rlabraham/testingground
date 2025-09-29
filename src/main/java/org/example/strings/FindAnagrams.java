package org.example.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAnagrams {
    public List<String> anagramsFound (String[] a, String[] b) {
        Set<String> result = new HashSet<>();
        Set<String> bSet = new HashSet<>();

        for (String s : b) {
            bSet.add(sortCharacters(s));
        }

        for (String word : a) {
            if (bSet.contains(sortCharacters(word))) {
                result.add(word);
            }
        }
        return result.stream().toList();
    }
    private static String sortCharacters(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
