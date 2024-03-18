package ch15.exercise.leetcode1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == min) {
                List<Integer> abs = new ArrayList<>();
                abs.add(arr[i]);
                abs.add(arr[i + 1]);
                list.add(abs);
            }
        }
        return list;
    }
}
