package ch15.exercise.leetcode1046;

// leetcode 1046 last stone

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>(Arrays.stream(stones).boxed().toList());


        while (stoneList.size() > 1) {
            stoneList.sort((a, b) -> b - a);
            int max1 = stoneList.remove(0);
            int max2 = stoneList.remove(0);

            int diff = max1 - max2;

            if (diff != 0) {
                stoneList.add(diff);
            }
        }
        if (stoneList.size() == 0) {
            return 0;
        } else {
            return stoneList.getFirst();
        }
    }
}