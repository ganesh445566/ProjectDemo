package com.demo;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(10);
        originalList.add(30);
        originalList.add(20);
        originalList.add(40);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : originalList) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("Original List: " + originalList);
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
