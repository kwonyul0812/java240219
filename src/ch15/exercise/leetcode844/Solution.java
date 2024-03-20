package ch15.exercise.leetcode844;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> str1 = new Stack<>();
        Stack<Character> str2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!str1.isEmpty())
                    str1.pop();
            } else {
                str1.push(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!str2.isEmpty())
                    str2.pop();
            } else {
                str2.push(t.charAt(i));
            }
        }


        if (str1.size() != str2.size())
            return false;

        for (int i = 0; i < str1.size(); i++) {
            if (str1.get(i) != str2.get(i))
                return false;
        }
        return true;


    }
}
