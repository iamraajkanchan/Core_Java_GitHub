package programs.dsa.string_example;


import programs.utility.Utility;

import java.util.HashMap;

public class DSAString {
    public String reverseString(String word) {
        String reversedString = "";
        for (int i = word.length() - 1; i > -1; i--) {
            reversedString += word.charAt(i);
        }
        return reversedString;
    }

    public void countWordInSentence(String sentence) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int countIndex = 0;
            for (int j = 0; j < words.length; j++) {
                if (currentWord.equalsIgnoreCase(words[j])) {
                    countIndex++;
                }
            }
            wordCount.put(currentWord, countIndex);
        }
        wordCount.forEach((word, count) -> {
            Utility.printToLogcat(DSAString.class, Thread.currentThread().getStackTrace().length >= 2 ? Thread.currentThread().getStackTrace()[2] : null, "Word: " + word + " ,Count: " + count);
        });
    }
}
