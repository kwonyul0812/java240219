package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        // C05CopyCode.java 파일을
        // temp/C05CopyCode.txt 파일로 복사

        // Reader, Writer 활용

//        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
//        String des = "temp/C05CopyCode.txt";
//
//        try {
//            Reader reader = new FileReader(src);
//            Writer writer = new FileWriter(des);
//
//            try (reader; writer) {
//                int len = 0;
//                char[] data = new char[100];
//
//                while ((len = reader.read(data)) != -1) {
//                    writer.write(data, 0, len);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C06CopyCode.txt";

        try {
            InputStream reader = new FileInputStream(src);
            OutputStream writer = new FileOutputStream(des);

            try (reader; writer) {
                int len = 0;
                byte[] data = new byte[100];

                while ((len = reader.read(data)) != -1) {
                    writer.write(data, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
