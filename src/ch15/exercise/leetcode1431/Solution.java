package ch15.exercise.leetcode1431;
// leetcode 1431번 문제, 1046, 119, 118, 1200


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 배열을 탐색해서 최고값 찾기

        // 배열을 탐색해서 각 아이템과 extraCandies를 더한 값이
        // 위에서 찾은 최고값보다 크거나 같으면 true 아니면 false
        // List에 추가(add)

        // 완성된 List를 리턴

        int max = 0;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        List<Boolean> list = new ArrayList<>();

        for (int i : candies) {
            int temp = candies[i] + extraCandies;
            if (temp >= max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
