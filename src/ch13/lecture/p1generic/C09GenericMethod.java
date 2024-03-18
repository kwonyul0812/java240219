package ch13.lecture.p1generic;

public class C09GenericMethod {
    public static void main(String[] args) {
        C07Box<String> box = new C07Box<>();
        // java는 메소드 파라미터로 type 파라미터 유추
        method("hello"); // String으로 유추
        method(34); // Integer로 유추

        String s = method1(); // String으로 유추
        Integer i = method1(); // Integer로 유추
    }

    // 제네릭 메소드 , 메소드에만 타입 파라미터가 필요할 경우 쓴다.
    public static <T> void method(T param) {
    }

    public static <T> T method1() {
        return null;
    }
}


