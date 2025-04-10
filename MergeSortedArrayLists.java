package com.demo;

import java.util.*;

public class MergeSortedArrayLists {
    public static void main(String[] args) {
        List<Integer> arraylist_1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> arraylist_2 = Arrays.asList(2, 4, 6, 8);

        List<Integer> mergedList = mergeSortedLists(arraylist_1, arraylist_2);

        System.out.println("Merged Sorted List: " + mergedList);
    }

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();

        int i = 0, j = 0;


        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }


        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }


        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }
}
