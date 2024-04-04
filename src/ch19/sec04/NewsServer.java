package ch19.sec04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {
    private static DatagramSocket datagramSocket = null;

    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("----------------------------------------------");

        // UDP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }

        scanner.close();

        // UDP 서버 종료
        stopServer();
    }

    public static void startServer() {
        Thread thread = new Thread(() -> {
            try {
                // DatagramSocket 생성 및 Port 바인딩
                datagramSocket = new DatagramSocket(50001);
                System.out.println("[서버] 시작됨");

                while (true) {
                    // 클라이언트가 구독하고 싶은 뉴스 주제 얻기
                    DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                    datagramSocket.receive(receivePacket);
                    String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");

                    // 클라이언트의 IP와 PORT 받기
                    SocketAddress socketAddress = receivePacket.getSocketAddress();

                    // 10개의 뉴스를 클라이언트로 전송
                    for (int i = 1; i <= 10; i++) {

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
