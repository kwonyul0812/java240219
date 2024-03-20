package ch15.exercise.leetcode1748;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// leetcode map 1748, 1512, 2006, 2206, 2363
public class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[100];
        int sum = 0;
        for (int i : nums) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1)
                sum += i;
        }
        return sum;
    }
}
