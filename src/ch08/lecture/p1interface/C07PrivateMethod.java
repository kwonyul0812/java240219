package ch08.lecture.p1interface;

public class C07PrivateMethod {
}

interface C07MyInterface {
    // public static final field
    // public abstract instance method // 몸통없음
    // public default method
    // public static method

    // private instance method
    default void method1() {
        System.out.println("C07MyInterface.method1");
        extracted();
    }

    default void method2() {
        System.out.println("C07MyInterface.method2");
        extracted();
    }

    // private instance method
    // 중복된 코드시에 private 메소드로 묶는게 좋다
    private void extracted() {
        System.out.println("두 메소드의 중복된 코드");
    }

    static void method3() {
        System.out.println("C07MyInterface.method3");
        doCommon();
    }

    static void method4() {
        System.out.println("C07MyInterface.method4");
        doCommon();
    }

    private static void doCommon() {
        System.out.println("두 스태틱의 중복된 코드");
    }
}
