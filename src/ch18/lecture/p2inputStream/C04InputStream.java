package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C04InputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data";
        try {
            InputStream is = new FileInputStream(fileName);
            try (is) {
                byte[] data = new byte[10];
                int len = 0;

                while ((len = is.read(data)) != -1) {
                    System.out.println(Arrays.toString(data));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
