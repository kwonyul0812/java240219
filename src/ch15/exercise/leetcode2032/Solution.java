package ch15.exercise.leetcode2032;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> list = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> lastSet = new HashSet<>();

        for (int i : nums1) set1.add(i);
        for (int i : nums2) set2.add(i);
        for (int i : nums3) set3.add(i);

        for (int i : set1) {
            if (set2.contains(i) == true || set3.contains(i))
                lastSet.add(i);
        }
        for (int i : set2) {
            if (set1.contains(i) == true || set3.contains(i))
                lastSet.add(i);
        }
        for (int i : set3) {
            if (set1.contains(i) == true || set2.contains(i))
                lastSet.add(i);
        }
        for (int i : lastSet)
            list.add(i);
        return list;

    }
}
