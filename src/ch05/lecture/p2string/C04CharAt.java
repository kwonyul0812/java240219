package ch05.lecture.p2string;

public class C04CharAt {
    public static void main(String[] args) {
        // 첫번째(index 0) s
        // 두번쨰(index 1) o
        // 세번째(index 2) n
        String a = "son"; //

        System.out.println(a.charAt(0)); // s
        System.out.println(a.charAt(1)); // o
        System.out.println(a.charAt(2)); // n

        char ch = a.charAt(0);
        System.out.println("ch : " + ch);

        // char 타입 리턴


        String b = """
                hello
                world
                """;
        System.out.println(b.charAt(0)); // h
        System.out.println(b.charAt(6)); // w
        System.out.println(b.charAt(b.length() - 1)); // 엔터

    }
}
