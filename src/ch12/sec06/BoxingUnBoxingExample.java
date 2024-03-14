package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());
        System.out.println(obj); // 재정의한 toString 호출

        int value = obj;
        System.out.println("value: " + value);

        int result = obj + 100; // 포장클래스 + 일반타입 의 경우 자동 타입변환되서 계산.
        System.out.println("result: " + result);
    }
}
