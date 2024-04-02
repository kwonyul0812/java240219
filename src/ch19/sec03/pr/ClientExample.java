package ch19.sec03.pr;

import java.io.*;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 33000);
        System.out.println("[클라이언트] 연결 성공");

        try (socket) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            try (bw;) {
                String sendMessage = "나는 자바가 좋아~";
                bw.write(sendMessage);
                bw.newLine(); // 개행 문자 추가
                bw.flush();
                System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);


                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                try (br;) {
                    String receiveMessage = br.readLine();
                    System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("[클라이언트] 연결 끊음");
    }
}
