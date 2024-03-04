package pr05.exercise;

import java.util.Arrays;
import java.util.Locale;

public class programmers3 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
    }

    public static String solution(String my_string) {
        String answer = "";

        String[] alpha = my_string.toLowerCase().split("");
        Arrays.sort(alpha);

        for (String a : alpha)
            answer += a;

        return answer;
    }
}