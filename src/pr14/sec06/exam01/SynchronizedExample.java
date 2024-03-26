package pr14.sec06.exam01;

public class SynchronizedExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1Thread user1Thread = new User1Thread();
        User2Thread user2Thread = new User2Thread();

        user1Thread.setCalculator(calculator);
        user2Thread.setCalculator(calculator);

        user1Thread.start();
        user2Thread.start();
    }
}
