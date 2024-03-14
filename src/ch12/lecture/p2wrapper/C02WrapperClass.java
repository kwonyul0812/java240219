package ch12.lecture.p2wrapper;

public class C02WrapperClass {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a; // auto boxing
//        Long e = c; // 상속관계가 아니라서 안됨.
//        Long d = a; //

        Number e = a;
        Object f = a;
    }
}
