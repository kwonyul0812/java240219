package ch06.lecture.p7access.package1;

import ch06.lecture.p7access.C01MyClass;

public class C03AccesModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 50;
//        o1.name = "hwang"; // package private
//        o1.address = ""; // private
    }
}
