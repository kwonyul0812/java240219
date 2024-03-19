package ch15.exercise.leetcode2215;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> numList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) set2.add(n);

        for (int i : set1) {
            if (set2.contains(i) == false)
                list1.add(i);
        }
        for (int i : set2) {
            if (set1.contains(i) == false)
                list2.add(i);
        }

        numList.add(list1);
        numList.add(list2);

        return numList;
    }
}
