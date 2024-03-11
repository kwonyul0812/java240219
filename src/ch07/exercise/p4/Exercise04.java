package ch07.exercise.p4;


public class Exercise04 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.method2();
    }
}

class Parent {
    public void method1(int a) {

    }

    void method2() {

    }
}

class Child extends Parent {
    @Override // 컴파일러가 컴파일시 이 메소드가 재정의 한것인지 확인함
    public void method1(int a) {

    }

    @Override
    public void method2() { // 재정의한 메소드의 접근제어자는 범위가 부모의 것보다 같거나 크다.


    }
}
