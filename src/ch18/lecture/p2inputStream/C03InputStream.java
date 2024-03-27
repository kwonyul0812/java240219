package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C03InputStream {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "temp/output9.data"; // 24 bytes
        InputStream is = new FileInputStream(fileName);

        try (is) {
            int data1 = is.read(); // 1 byte

            byte[] datas = new byte[10];

            int len1 = is.read(datas); // 10 bytes 읽어서 배열에 저장하고 읽은 바이트 수 10 리턴
            int len2 = is.read(datas); // 10 bytes 읽어서 배열에 저장하고 10 리턴
            int len3 = is.read(datas); // 3 bytes 읽어서 배열에 저장하고 3리턴
            int len4 = is.read(datas); // 읽은 데이터 없고 -1 리턴

            System.out.println("len1 = " + len1);
            System.out.println("len2 = " + len2);
            System.out.println("len3 = " + len3);
            System.out.println("len4 = " + len4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
