package ch11.exercise.p8;

import java.io.IOException;
import java.io.OutputStream;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("temp/file.txt");

        try (fw) {
            fw.write("Java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
