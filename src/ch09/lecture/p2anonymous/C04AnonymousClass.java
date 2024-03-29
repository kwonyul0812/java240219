package ch09.lecture.p2anonymous;

public class C04AnonymousClass {
    public static void main(String[] args) {
//        C04Parent obj = new C04Child();
        // 익명클래스 : 객체 인스턴스를 여러개 만들 필요 없을때 사용
        C04Parent obj = new C04Parent() {
            @Override
            void method() {
                System.out.println("C04Child.method");
            }
        };
        obj.method();
    }
}

class C04Parent {
    void method() {
        System.out.println("C04Parent.method");
    }
}


