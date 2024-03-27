package pr18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("temp/test.jpg");
            OutputStream os = new FileOutputStream("temp/test-copy.jpg");

            try (is; os) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
