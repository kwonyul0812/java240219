package ch16.exercise.programmers01;

import java.util.*;
// 문자열의 사전순(코드순 비교)
// String.compareTo
// 문자열 내맘대로

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (x, y) -> x.charAt(n) == y.charAt(n) ? x.compareTo(y) : x.charAt(n) - y.charAt(n));

        return strings;
    }
}
