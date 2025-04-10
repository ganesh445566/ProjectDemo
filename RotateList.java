package com.demo;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;

        int n = list.size();
        k = k % n;

        List<Integer> rotated = new ArrayList<>();


        rotated.addAll(list.subList(n - k, n));


        rotated.addAll(list.subList(0, n - k));

        System.out.println("Original List: " + list);
        System.out.println("Rotated List: " + rotated);
    }
}
