package ch15.exercise.leetcode1512;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int pairs = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                int count = map.get(nums[i]);
//                count++;
//                map.put(nums[i], count);
//                pairs += map.get(nums[i]);
//
//            } else {
//                map.put(nums[i], 0);
//            }
//        }
//        return pairs;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int cnt = map.get(i);
                cnt++;
                map.put(i, cnt);
            } else {
                map.put(i, 1);
            }
        }
        int sum = 0;
        Set<Integer> set = map.keySet();
        for (int i : set) {
            int val = map.get(i);
            int cal = val * (val - 1) / 2;
            sum += cal;
        }
        return sum;
    }
}
