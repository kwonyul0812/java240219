package pr18.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("temp/test1.db");
            try (is) {
                int data = 0;
                while ((data = is.read()) != -1) {
                    System.out.println(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
