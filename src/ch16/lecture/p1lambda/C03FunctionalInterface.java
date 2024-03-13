package ch16.lecture.p1lambda;

public class C03FunctionalInterface {
}

//@FunctionalInterface //아님
interface C03MyInterface1 {

}

@FunctionalInterface
interface C03MyInterface2 {
    void method1();
}

//@FunctionalInterface //아님
interface C03MyInterface3 {
    void method1();

    void method2();
}

@FunctionalInterface // ok, 추상메소드가 하나 이기 때문
interface C03MyInterface4 {
    void method1();

    default void method2() {

    }
}

@FunctionalInterface
interface C03MyInterface5 {
    void method1();

    String toString(); // Object 가 상속한 메소드 이기때문에 재정의 하지 않아도 됨.

    int hashCode();

    boolean equals(Object o);
}