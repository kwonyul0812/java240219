package ch18.exercise.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br;) {
            System.out.print("원본 파일 경로: ");
            String originalFilePath = br.readLine();

            System.out.print("복사 파일 경로: ");
            String destinationFilePath = br.readLine();

            File originalFile = new File(originalFilePath);

            if (originalFile.exists()) {
                File destinationFile = new File(destinationFilePath);
                File destinationDirectory = destinationFile.getParentFile();
                if (!destinationDirectory.exists()) {
                    destinationDirectory.mkdirs();
                }

                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFile));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile));

                try (bis; bos) {
                    int len = 0;
                    byte[] data = new byte[1024];

                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                    System.out.println("복사가 성공되었습니다.");
                }
            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        } catch (Exception e) {
        }


    }
}
