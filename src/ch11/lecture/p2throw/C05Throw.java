package ch11.lecture.p2throw;

public class C05Throw {
    public static void main(String[] args) throws ClassNotFoundException {
        someMethod3();
    }

    public static void someMethod3() throws ClassNotFoundException {
        someMethod2();
    }

    public static void someMethod2() throws ClassNotFoundException {
        somemethod1(); // try catch or 메소드 시그니처 throw 선언
    }

    public static void somemethod1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
