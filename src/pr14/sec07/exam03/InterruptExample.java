package pr14.sec07.exam03;

import pr14.sec07.exam02.PrintThread;

public class InterruptExample {
    public static void main(String[] args) {

        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        printThread.interrupt();
    }
}
