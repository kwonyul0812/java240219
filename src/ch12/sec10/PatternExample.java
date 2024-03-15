package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExap = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExap, data);
        if (result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 불일치");
        }

        regExap = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mtcompanycom";
        result = Pattern.matches(regExap, data);
        if (result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 불일치");
        }
    }
}
