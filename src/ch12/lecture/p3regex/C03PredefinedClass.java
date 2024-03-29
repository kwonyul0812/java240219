package ch12.lecture.p3regex;

public class C03PredefinedClass {
    public static void main(String[] args) {
        // [0-9] : \d (숫자)
        // whitespace : \s (공백)
        // word character [a-zA-Z0-9_] : \w (범위에 해당하는 문자 전부)

        String p1 = "\\d";
        System.out.println("0".matches(p1)); // true
        System.out.println("5".matches(p1)); // true
        System.out.println("a".matches(p1)); // false
        System.out.println("012".matches(p1)); // false

        System.out.println(" ".matches("\\s")); // true
        System.out.println("\t".matches("\\s")); // true
        System.out.println("\n".matches("\\s")); // true

        // 연습
        String str = "손 흥민";
        String s = str.replaceAll("\\s", ""); // 공백을 전부 빈공간으로
        System.out.println(s);

        // word character
        System.out.println("s".matches("\\w")); // true
        System.out.println("9".matches("\\w")); // true
        System.out.println("W".matches("\\w")); // true
        System.out.println("W".matches("\\w")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println(" ".matches("\\w")); // false
        System.out.println("$".matches("\\w")); // false

        // 모든 문자
        System.out.println("a".matches(".")); // true
        System.out.println(" ".matches(".")); // true
        System.out.println("$".matches(".")); // true
        System.out.println("".matches(".")); // false
    }
}
