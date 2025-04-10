package com.demo;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(4, 4, 1, 2, 2, 2, 3, 3);
        int k = 2;


        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : inputList) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());


        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));


        System.out.println("Top " + k + " frequent elements:");
        for (int i = 0; i < k && i < entryList.size(); i++) {

            Map.Entry<Integer, Integer> entry = entryList.get(i);
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}
