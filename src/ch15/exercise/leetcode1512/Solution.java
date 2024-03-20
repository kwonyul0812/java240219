package ch15.exercise.leetcode1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
                pairs += map.get(nums[i]);

            } else {
                map.put(nums[i], 0);
            }
        }
        return pairs;
    }
}
