package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C05Of {
    public static void main(String[] args) {
        // List.of 로 리스트 객체 생성
        List<String> list1 = List.of();
        System.out.println(list1.size());

        List<String> list2 = List.of("java");
        System.out.println(list2.size());
        System.out.println(list2);

        List<String> list3 = List.of("react", "vue", "jsp");
//        list3.add("hello"); // list.of로 만든 객체는 수정불가능(추가, 삭제)
//        list3.remove(0);
//        list3.set(0, "angular"); // Exception
        System.out.println(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("spring");
        list4.add("css");
        System.out.println(list4);

        // 중첩된 List
        List<List<Integer>> list5 = List.of(
                List.of(95, 96),
                List.of(83, 92, 96),
                List.of(78, 83, 93, 87, 88)
        );

        System.out.println(list5.get(1).get(1));
        System.out.println(list5.get(2).get(2));
        System.out.println(list5.get(0).get(0));
    }
}
