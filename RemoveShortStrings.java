package com.demo;

import java.util.*;

public class RemoveShortStrings {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("a", "ab", "abc", "java", "is", "fun", "ok", "yes"));


        words.removeIf(word -> word.length() < 3);

        System.out.println("Filtered List: " + words);
    }
}
