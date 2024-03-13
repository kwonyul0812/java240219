package pr06;

public class Example {
    public static void main(String[] args) {
        Test test = () -> {
            System.out.println("1");
        };
        test.method();
    }
}
