package com.company;

import java.util.List;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 5, 5, 6, 9};
    }

    public int maxOccurrences(List<Integer> list) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int mode = 0;

        for (int n : list) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }else {
                map.put(n, 1);
            }

            if (??????)
        }
        return mode;
    }
}
