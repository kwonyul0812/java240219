package ch11.lecture.p2throw;

public class C04Throw {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
