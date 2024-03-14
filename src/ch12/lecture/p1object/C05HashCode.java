package ch12.lecture.p1object;

public class C05HashCode {
    public static void main(String[] args) {
        // hascode 는 객체를 분류하는 용도
        // 참조값과는 다름, hashcode가 같은 객체면 같은값, 다른객체면 다른값을 가짐.
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        int h1 = o1.hashCode();
        int h2 = o2.hashCode();
        int h3 = o3.hashCode();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
