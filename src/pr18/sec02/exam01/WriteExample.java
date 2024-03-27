package pr18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("temp/practice1.txt");
            try (os) {
                byte a = 10;
                byte b = 20;
                byte c = 30;

                os.write(a);
                os.write(b);
                os.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
