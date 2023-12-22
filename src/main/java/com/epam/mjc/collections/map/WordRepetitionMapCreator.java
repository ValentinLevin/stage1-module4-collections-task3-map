package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        String[] words = sentence.split("\\W+");
        for (String word: words) {
            if (!word.isEmpty()) {
                String wordInLowerCase = word.toLowerCase();
                Integer count = result.getOrDefault(wordInLowerCase, 0);
                result.put(wordInLowerCase, count + 1);
            }
        }
        return result;
    }
}
