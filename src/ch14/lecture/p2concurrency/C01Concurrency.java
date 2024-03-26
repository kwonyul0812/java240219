package ch14.lecture.p2concurrency;

public class C01Concurrency {
    public static void main(String[] args) throws InterruptedException {
        MyRun1 r = new MyRun1();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        System.out.println("r.getValue() = " + r.getValue()); // 0

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // 여러 쓰레드가 하나의 객체의 상태를 바꾸려고 하지 말아라 -> 필요시 동기화(synchronized) 사용할것
        // 하나의 객체의 값을 여러 쓰레드가 값을 바꾸려고 하다보니 의도하던 값이 나오지 않음
        System.out.println("r.getValue() = " + r.getValue());
    }
}

class MyRun1 implements Runnable {
    private long value;

    public long getValue() {
        return value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            value++;
        }
    }
}
