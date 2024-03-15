package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // 정규표현식 : 특정 규칙의 문자열 표현하기 위한 문자열 패턴


        // 한 문자
        String pattern1 = "a";
        boolean b1 = "a".matches(pattern1); // a라는 문자는 패턴과 일치하는가? true
        System.out.println("b1 = " + b1);

        System.out.println("b".matches(pattern1)); // b라는 문자는 패턴과 일치하는가? false
        System.out.println("aa".matches(pattern1)); // false
        System.out.println("aa".matches("aa")); // true
        System.out.println("ab".matches("ab")); // true
        System.out.println("ab".matches("ba")); // false

        System.out.println("\\".matches("\\\\")); // 역스래시(\) 하나를 표현하기 위해선 \\ 이기떄문에 \\\\, true

        // regex . : 모든 문자라는 의미
        System.out.println(".".matches(".")); // true
        System.out.println("a".matches(".")); // true
        System.out.println("c".matches(".")); // true
        System.out.println("9".matches(".")); // true
        System.out.println("abc".matches(".")); // .은 모든문자 하나만
        System.out.println(".".matches("\\.")); // true, . 패턴을 찾기 위해선 \\. 사용
        System.out.println("a".matches("\\."));


        // 대소문자 구분함
        System.out.println("a".matches("a")); // true
        System.out.println("a".matches("A")); // false
        System.out.println("A".matches("a")); // false


    }
}
