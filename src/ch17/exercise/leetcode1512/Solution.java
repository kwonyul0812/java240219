package ch17.exercise.leetcode1512;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        return (int) Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .values()
                .stream()
                .mapToLong(v -> v * (v - 1) / 2)
                .sum();

    }
}
