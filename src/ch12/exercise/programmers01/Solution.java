package ch12.exercise.programmers01;

import java.util.Arrays;

// 프로그래머스 문자열 잘라서 정렬하기
public class Solution {
    public String[] solution(String myString) {
        String temp = myString.replaceAll("^x+|x+$", "");
        String[] answer = temp.split("x+");
        Arrays.sort(answer);

        return answer;
    }
}
