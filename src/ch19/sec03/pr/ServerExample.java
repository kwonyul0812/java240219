package ch19.sec03.pr;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) throws IOException {

        System.out.println("----------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("----------------------------------------------");

        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }
        scanner.close();

        stopServer();


    }

    public static void startServer() {
        Thread thread = new Thread(() -> {
            try {
                serverSocket = new ServerSocket(33000);
                System.out.println("[서버] 시작됨");

                while (true) {

                    System.out.println("\n[서버] 연결 요청을 기다림\n");
                    Socket socket = serverSocket.accept();

                    InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                    System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String message = br.readLine();

                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    bw.write(message);
                    bw.flush();
                    System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);

                    br.close(); // 수정: BufferedReader를 닫음
                    bw.close(); // 수정: BufferedWriter를 닫음
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }

    public static void stopServer() throws IOException {
        serverSocket.close();
        System.out.println("[서버] 종료됨");
    }
}
