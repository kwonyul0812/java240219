package ch15.exercise.leetcode1700;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> std = new LinkedList<>();
        Stack<Integer> sand = new Stack<>();

        for (int i : students)
            std.offer(i);
        for (int i = sandwiches.length - 1; i >= 0; i--)
            sand.push(sandwiches[i]);

        int count = 0;

        while (count < sand.size()) {
            if (std.peek() == sand.peek()) {
                std.poll();
                sand.pop();
                count = 0;
            } else {
                int a = std.poll();
                std.offer(a);
                count++;
            }
        }
        int stdlen = std.size();
        return stdlen;

    }
}
