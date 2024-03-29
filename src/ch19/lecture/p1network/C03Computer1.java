package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    public static void main(String[] args) throws IOException {
        // ServerSocket 만들기
        ServerSocket serverSocket = new ServerSocket(9000);
        // 연결 기다린 후
        // 연결되면 Socket 만들기
        Socket socket = serverSocket.accept();
        try (socket) {
            // Socket에서 OutputStream 만들기
            OutputStream os = socket.getOutputStream();
            // BufferedOutputStream 연결
            BufferedOutputStream bos = new BufferedOutputStream(os);

            // 파일 아무거나
            // FileIntputStream 만들기
            FileInputStream fis = new FileInputStream("temp/cat.jpg");
            // BufferedInputStream 연결
            BufferedInputStream bis = new BufferedInputStream(fis);

            try (os; bos; fis; bis;) {
                // BufferedInputStream으로 읽은 데이터
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    // BufferedOutputStream으로 출력
                    bos.write(data, 0, len);
                }
            }
        }
    }
}
