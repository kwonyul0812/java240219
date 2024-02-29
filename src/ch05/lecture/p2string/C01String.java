package ch05.lecture.p2string;

public class C01String {
    public static void main(String[] args) {

        String s1 = new String("son");
        String s2 = new String("lee");
        String s3 = new String("son");

        System.out.println(s1.contentEquals(s3)); // 문자열 내용이 같은지
        System.out.println(s1.equals(s3));

        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.equals(s2));


    }
}
