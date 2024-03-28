package ch18.lecture.p6file;

import java.io.File;

public class C01File {
    public static void main(String[] args) {
        String path = "src/ch18/lecture/p6file/C01File.java";
        File file = new File(path);

        long size = file.length(); // 파일 길이(크기)
        System.out.println("size = " + size);

        boolean exists = file.exists(); // 파일 존재여부
        System.out.println("exists = " + exists);

        boolean directory = file.isDirectory(); // 폴더 존재여부
        System.out.println("directory = " + directory);

        String absolutePath = file.getAbsolutePath(); // 파일 절대경로
        System.out.println("absolutePath = " + absolutePath);

        String parent = file.getParent();
        System.out.println("parent = " + parent);
    }
}
