package pr17.lecture.p1stream;

import java.util.List;

public class C01Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 5, 9, 20, 7, 22, 33, 55, 66);

        int sum = list.stream()
                .filter(e -> e % 2 == 1)
                .mapToInt(integer -> integer.intValue())
                .sum();
        System.out.println(sum);
    }
}
