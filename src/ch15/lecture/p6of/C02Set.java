package ch15.lecture.p6of;

import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("spring", "java", "css", "react");
        System.out.println(set1);
        // 수정 불가
//        set1.add("vue"); // x

        // Set.of의 경우 중복된 요소가 있으면 오류발생
//        Set<String> set2 = Set.of("spring", "java", "spring");

    }
}
