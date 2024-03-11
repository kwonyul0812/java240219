package ch08.lecture.p1interface;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C08String {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        // String이 가지고 있는 인터페이스들, java api 참조
        Serializable serializable = s;
        CharSequence charSequence = s;
        Comparable comparable = s;
        Constable constable = s;
        ConstantDesc constableDesc = s;

        comparable.compareTo("hello");
        charSequence.chars();

        System.out.println(s instanceof String); // true
        System.out.println(s instanceof Object);
        System.out.println(s instanceof Serializable);
        System.out.println(s instanceof CharSequence);
        System.out.println(s instanceof Comparable);
        System.out.println(s instanceof Constable);
        System.out.println(s instanceof ConstantDesc);

        System.out.println(charSequence instanceof CharSequence); // true
        System.out.println(charSequence instanceof String);
        System.out.println(charSequence instanceof Serializable);

    }
}
