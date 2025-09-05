package org.example;

public class WordProcessor {
    private final String word;

    public WordProcessor (String wordProcessor) {
        this.word = wordProcessor;
    }

    public String stripandCapitalize() {
        return word.strip().toUpperCase();
    }
}
