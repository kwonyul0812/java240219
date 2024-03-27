package pr18.sec02.exam02;

import java.io.*;
import java.util.Arrays;

public class WriteExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("temp/practice2.txt");
            try (is) {
                byte[] arr = new byte[5];
                int len = 0;
                while (true) {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
