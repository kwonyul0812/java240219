package c02.lecture.p02type;

public class C28Printf {
    public static void main(String[] args) {
        // System.out.printf()

        // 파라미터 1개 (print와 유사)
        System.out.printf("hello world!\n");

        // 파라미터 2개 이상
        // 첫번째 파라미터 문자열에 두번째, 세번째... 파라미터를 포함해서 출력
        System.out.printf("hello %s\n", "jane");

        // 파라미터 3개
        System.out.printf("hello %s and %s\n", "son", "park");

        String a = "son";
        String b = "park";
//        System.out.println(STR."hello \{a} and \{b}"); // java 21 부터 사용 가능
        System.out.printf("hello %s and %s\n", a, b);

        System.out.printf("%1$s %2$s %3$s\n", "son", "lee", "park");
        System.out.printf("%2$s %3$s %1$s\n", "son", "lee", "park");
        System.out.printf("%s %s %s %1$s %3$s\n", "son", "lee", "park");

        System.out.printf("%s\n", "son");
        System.out.printf("%5s\n", "son");
        System.out.printf("%-5s", "son");

    }
}
