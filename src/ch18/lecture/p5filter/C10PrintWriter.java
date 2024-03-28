package ch18.lecture.p5filter;

import java.io.*;

public class C10PrintWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output10.txt";
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.print("hello world");
        pw.print("😂🤣❤️");
        pw.println();
        pw.println("점심 뭐먹지??");
        pw.println("배고프다.");
        pw.printf("%s을 먹을까? %s을 먹을까?", "라면", "돈까스");

        pw.close();
    }
}
