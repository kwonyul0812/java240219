package ch15.exercise.leetcode118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < numRows + 1; i++) {
            List<Integer> arrItem = new ArrayList<>();
            for (int k = 0; k <= i; k++) {
                if (0 < k && k < i) {
                    arrItem.add(k, arr.get(i - 1).get(k - 1) + arr.get(i - 1).get(k));
                } else {
                    arrItem.add(1);
                }
            }
            arr.add(arrItem);
        }
        return arr;
    }
}