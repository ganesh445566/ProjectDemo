package com.demo;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 3, 4, 5, 6);



        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }



        Integer result = null;
        for (int num : list) {
            if (freqMap.get(num) == 1) {
                result = num;
                break;
            }
        }



        if (result != null) {
            System.out.println("First non-repeating element: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
