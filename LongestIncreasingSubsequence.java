package com.demo;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18);
        List<Integer> lis = findLIS(nums);
        System.out.println("Longest Increasing Subsequence: " + lis);
    }

    public static List<Integer> findLIS(List<Integer> nums) {
        if (nums.isEmpty()) return new ArrayList<>();

        int n = nums.size();
        int[] dp = new int[n];
        int[] prev = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLen = 1;
        int lastIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums.get(j) < nums.get(i) && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }


        List<Integer> lis = new ArrayList<>();
        while (lastIndex != -1) {
            lis.add(nums.get(lastIndex));
            lastIndex = prev[lastIndex];
        }

        Collections.reverse(lis);
        return lis;
    }
}
