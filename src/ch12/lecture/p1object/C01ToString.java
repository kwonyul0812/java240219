package ch12.lecture.p1object;

public class C01ToString {
    public static void main(String[] args) {
        C01MyClass1 obj1 = new C01MyClass1();
        C01MyClass2 obj2 = new C01MyClass2();
        Object o1 = obj1;
        Object o2 = obj2;
        Object o3 = new C01MyClass1();
        Object o4 = new C01MyClass1();

        String s1 = obj1.toString();
        String s2 = obj2.toString();
        String s3 = o3.toString();
        String s4 = o4.toString();

        String s5 = o1.toString();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
    }
}

class C01MyClass1 extends Object {
    @Override
    public String toString() {
        return "마이클래스1 객체다.";
    }
}

// extends Object 생략
class C01MyClass2 {
    @Override
    public String toString() {
        return "마이클래스2 객체다";
    }
}
