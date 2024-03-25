package ch11.lecture.p1exception;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String"); // ClassNotFoundException
            List.of().get(0); // IndexOutOfBoundsException
            Integer.parseInt("hundred"); // NumberFormatException
        } catch (ClassNotFoundException e) { // 상위타입이 Exception 이기 때문에
            System.out.println("코드2");      // ClassNotFoundException 예외 처리가 안되기에 먼저 선언해준다.
        } catch (Exception e) {
            System.out.println("코드1");
        }
    }
}
