package pr18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("temp/test2.db");
            try (is) {
                byte[] arr = new byte[5];
                int len = 0;
                while ((len = is.read(arr)) != -1) {
                    for (int i = 0; i < len; i++) {
                        System.out.println(arr[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
