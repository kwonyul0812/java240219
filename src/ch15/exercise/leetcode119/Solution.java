package ch15.exercise.leetcode119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode 119
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>[] arr = new ArrayList[rowIndex + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<Integer>();
            for (int k = 0; k <= i; k++) {
                if (0 < k && k < i) {
                    arr[i].add(k, arr[i - 1].get(k - 1) + arr[i - 1].get(k));
                } else {
                    arr[i].add(1);
                }
            }
            System.out.println(arr[i]);
        }
        return arr[rowIndex];

//        List<Integer> prev = new ArrayList<>();
//        prev.add(1);
//
//        for (int i = 1; i <= rowIndex; i++) {
//            List<Integer> next = new ArrayList<>();
//            next.add(1);
//            for (int n = 1; n < prev.size(); n++) {
//                int sum = prev.get(n) + prev.get(n - 1);
//                next.add(sum);
//            }
//            next.add(1);
//            prev = next;
//        }
//        return prev;
    }
}
