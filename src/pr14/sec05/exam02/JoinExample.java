package pr14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
        }

        System.out.println("Sum의 합 : " + sumThread.getSum());
    }
}
