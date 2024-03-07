package ch07.sec7.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1(); // Parent-method1
        parent.method2(); // Child-method2
//        parent.method3(); //
    }
}
