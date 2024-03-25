package pr13.exercise.p2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.set("홍길동");
        System.out.println(container1.get());

        Container<Integer> container2 = new Container<>();
        container2.set(100);
        System.out.println(container2.get());
    }
}
