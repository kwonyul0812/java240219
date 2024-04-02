package ch19.sec03.exam02;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("----------------------------------------------");

        // TCP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }

        scanner.close();

        // TCP 서버 종료
        stopServer();
    }

    public static void startServer() {
        // 작업 스레드 정의
        Thread thread = new Thread(() -> {
            try {
                serverSocket = new ServerSocket(50001);
                System.out.println("[서버] 시작됨");

                // 연결 수락 및 데이터 통신
                while (true) {
                    System.out.println("\n[서버] 연결 요청을 기다림\n");
                    //연결 수락
                    Socket socket = serverSocket.accept();

                    // 연결된 클라이언트 정보 얻기
                    InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                    System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

                    // 데이터 받기
                    DataInputStream dis = new DataInputStream(socket.getInputStream());
                    String message = dis.readUTF();

                    // 데이터 다시 보내기
                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    dos.writeUTF(message);
                    dos.flush();
                    System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);

//                    InputStream is = socket.getInputStream();
//                    byte[] dataIn = new byte[1024];
//                    int len = is.read(dataIn);
//                    String message = new String(dataIn, 0, len, "UTF-8");
//
//                    OutputStream os = socket.getOutputStream();
//                    dataIn = message.getBytes("UTF-8");
//                    os.write(dataIn);
//                    os.flush();
//                    System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);
//
                    socket.close();
                    System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
                }
            } catch (IOException e) {
                System.out.println("[서버] " + e.getMessage());
            }
        });
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
        }
    }
}
