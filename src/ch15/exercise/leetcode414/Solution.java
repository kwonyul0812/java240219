package ch15.exercise.leetcode414;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums) {
            set.add(i);
        }
        NavigableSet<Integer> descendingSet = set.descendingSet();
        if (descendingSet.size() < 3) {
            return descendingSet.first();
        } else {
            descendingSet.removeFirst();
            descendingSet.removeFirst();
            return descendingSet.first();
        }

    }
}
