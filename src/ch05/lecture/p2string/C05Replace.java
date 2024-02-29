package ch05.lecture.p2string;

public class C05Replace {
    public static void main(String[] args) {
        String s = "my name is son";

        String t = s.replace("my", "your");
        System.out.println(s);
        System.out.println(t);

        String h = "hello world!";

        String w = h.replace("hello", "bye");
        System.out.println(w);
    }
}
