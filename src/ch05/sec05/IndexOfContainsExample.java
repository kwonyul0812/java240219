package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {

        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍"); // 해당값이 있는 인덱스 위치 반환
        System.out.println(location);
        String substring = subject.substring(location); // 3번 인덱스부터 끝까지 리턴
        System.out.println(substring);

        location = subject.indexOf("자바"); // 있으면 인덱스번호 or 없으면 -1 반환
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
        boolean result = subject.contains("자바"); // true false 반환
        if (result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
