package ch05.lecture.p1array;

import java.util.Scanner;

public class C24Scanner {
    public static void main(String[] args) {
        String s = """
                my age 33
                your age 44
                """;

        Scanner scanner = new Scanner(s);
        String t1 = scanner.next(); // my
        String t2 = scanner.next(); // age
        int t3 = scanner.nextInt(); // 33

        System.out.println(t3);

        String line1 = scanner.nextLine(); // 엔터 만나는순간 출력 : 공백으로 출력
        String line2 = scanner.nextLine(); //your age 44

        System.out.println("line1 = " + line1);
        System.out.println("line2 = " + line2);

    }
}
