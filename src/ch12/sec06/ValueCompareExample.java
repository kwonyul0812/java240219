package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==: " + (obj1 == obj2));
        System.out.println("equals(): " + obj1.equals(obj2));
        System.out.println();

        // -128 ~ 127 의 범위는 같은 객체를 쓴다.
        // 참조타입의 경우 equals 메소드를 써서 내부값을 비교할것.
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==: " + (obj3 == obj4));
        System.out.println("equals: " + obj3.equals(obj4));
    }
}
