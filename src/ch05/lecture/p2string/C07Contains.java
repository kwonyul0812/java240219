package ch05.lecture.p2string;

public class C07Contains {
    public static void main(String[] args) {
        String s1 = "my name is son";
        String s2 = "my name is lee";

        String text1 = "i love my mother";
        String text2 = "i love my father";

        boolean test1 = text1.contains("mother");
        boolean test2 = text2.contains("mother");

        System.out.println("test1 : " + test1);
        System.out.println("test2 : " + test2);

        boolean b1 = s1.contains("son");
        boolean b2 = s2.contains("son");
        System.out.println(b1);
        System.out.println(b2);

        String s3 = "my name is Son";
        boolean b3 = s3.contains("son"); // false

        System.out.println(b3);
        String s4 = s3.toLowerCase();
        boolean b4 = s4.contains("son");
        System.out.println(b4);


    }
}
