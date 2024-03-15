package ch13.lecture.p1generic;

public class C05Polymorphism {
    public static void main(String[] args) {
        C05Box<Number> box1 = new C05Box<>();
        C05Box<Integer> box2 = new C05Box<>();
        C05Box<Double> box3 = new C05Box<>();

        box1.someMethod();
        box2.someMethod();
        box3.someMethod();
    }
}

// 제한된 타입파라미터
// Number의 메소드를 쓰기위해 타입을 Number, 하위클래스로 제한한다.
class C05Box<T extends Number> { // Number 타입으로 제한하겠다
    private T item;

    public void someMethod() {
        item.intValue(); // Number의 추상메소드
    }
}
