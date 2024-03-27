package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data";
        try (OutputStream os = new FileOutputStream(fileName)) {

            os.write(23434); // 1byte 쓰기

            byte[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110}; // 11 bytes

            os.write(data);
            os.write(data, 0, 10); // 0번 인덱스부터 10개 , 10 bytes
            os.write(data, 5, 3); // 5번 인덱스부터 3개 , 3 bytes

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
