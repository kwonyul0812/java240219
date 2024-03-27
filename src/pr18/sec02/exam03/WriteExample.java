package pr18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("temp/practice3.db");
            try (os) {
                byte[] arr = {10, 20, 30, 40, 50};
                os.write(arr, 1, 3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
