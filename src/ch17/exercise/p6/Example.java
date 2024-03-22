package ch17.exercise.p6;

import java.util.List;
import java.util.OptionalDouble;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("평균 나이: " + avg);
    }
}
