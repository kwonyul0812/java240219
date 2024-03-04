package ch05.exercise;

import java.util.Arrays;
import java.util.Locale;

public class programmers3 { // 문자열 정렬하기(2)
    public static void main(String[] args) {

        System.out.println(solution("Bcad"));
    }

    public static String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] alp = my_string.split("");

        Arrays.sort(alp); // 문자열 정렬 메소드 Arrays.sort(배열)

        for (int i = 0; i < alp.length; i++)
            answer += alp[i];
        return answer;
    }
}
