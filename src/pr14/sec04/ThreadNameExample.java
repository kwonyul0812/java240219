package pr14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // 메인의 쓰레드 참조값
        System.out.println(mainThread.getName() + "실행");

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + "실행");
                }
            };
            thread.start();
        }

        Thread chat = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        chat.setName("chat-thread");
        chat.start();

    }
}
