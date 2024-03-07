package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {

//        Singleton onj1 = new Singleton();
//        Singleton onj1 = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("같은 싱글톤 객체 입니다");
        } else {
            System.out.println("다른 싱글톤 객체 입니다");
        }
    }
}
