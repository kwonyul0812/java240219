package pr19.practice1;

import java.io.*;
import java.net.Socket;

public class Computer2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.1.61", 9000);
        try (socket) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try (os; osw; bw; pw; br) {
                String data = "";
                while (true) {
                    System.out.print("입력>");
                    data = br.readLine();
                    if (data.equals("exit")) break;
                    pw.println(data);
                    pw.flush();
                }
            }
        }
    }
}
