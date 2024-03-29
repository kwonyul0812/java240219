package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class C05Computer1 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9000);

        while (true) {
            Socket socket = serverSocket.accept();

            Thread t = new Thread(() -> {
                try (socket) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    try (br;) {
                        SocketAddress client = socket.getRemoteSocketAddress();
                        while (true) {
                            String message = br.readLine();
                            System.out.println(client + ">" + message);
                            if (message.equals("bye")) break;
                        }
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            });
            t.start();
        }
    }
}
