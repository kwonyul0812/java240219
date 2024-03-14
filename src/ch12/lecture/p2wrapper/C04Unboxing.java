package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a = 3; // auto boxing

        int c = a.intValue(); // unboxing 옛날방식
        int b = a; // auto unboxing 현재방식

        Long d = 5L;

        long e = d; // auto unboxing
        double f = e; // 기본타입 형변환
        double g = d; // auto unboxing, 기본타입 형변환 동시에

        Integer h = null;
        int i = h; // auto unboxing
        // null 값을 unboxing 할수 없기에 오류가 남.

        System.out.println("프로그램 종료");
    }
}
