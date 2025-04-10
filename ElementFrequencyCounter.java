package com.demo;

import java.util.*;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String fruit : fruits) {
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }


        System.out.println("Element Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
