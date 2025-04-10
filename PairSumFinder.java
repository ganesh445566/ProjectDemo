package com.demo;

import java.util.*;

public class PairSumFinder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 3, 5, 7);
        int targetSum = 7;

        findPairsWithSum(list, targetSum);
    }

    public static void findPairsWithSum(List<Integer> list, int targetSum) {
        Set<Integer> seen = new HashSet<>();
        Set<String> printedPairs = new HashSet<>();

        System.out.println("Pairs with sum " + targetSum + ":");

        for (int num : list) {
            int complement = targetSum - num;

            if (seen.contains(complement)) {

                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String pairKey = a + "," + b;

                if (!printedPairs.contains(pairKey)) {
                    System.out.println("(" + a + ", " + b + ")");
                    printedPairs.add(pairKey);
                }
            }
            seen.add(num);
        }
    }
}
