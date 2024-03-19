package ch15.exercise.leetcode442;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode 287, 442, 2215, 2032, 771, 1684
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}