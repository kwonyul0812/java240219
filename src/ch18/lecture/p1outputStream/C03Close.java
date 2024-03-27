package ch18.lecture.p1outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03Close {
    public static void main(String[] args) {
        String fileName = "temp/output3.data";

        OutputStream os = null;
        // os를 try 문에서 선언하게 될경우 중괄호 안이기에 finally에서 close 할 수 없음
        try {
            os = new FileOutputStream(fileName);

            // 데이터 출력 작업
            os.write(298374);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close(); // 꼭 해야함!
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
