package ch11.lecture.p2throw;

import java.sql.SQLException;

public class C06Throw {
    public static void main(String[] args) {
        try {
            someMethod1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void someMethod1() throws ClassNotFoundException, SQLException { // throws Exception 가능
        boolean b1 = true;     // throw할 예외가 많다면 메소드 선언부에 나열해서 던진다. 공통된 상위타입이라면 상위타입으로 던지기 가능
        boolean b2 = true;

        if (b1) {
            throw new ClassNotFoundException();
        }
        if (b2) {
            throw new SQLException();
        }
    }
}
