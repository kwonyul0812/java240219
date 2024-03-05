package ch06.lecture.p5static;

import java.util.Arrays;
import java.util.Scanner;

public class C02Static {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {3, 4};
        System.out.println(Arrays.toString(a));

        // static 메소드는 객체 생성하지 않고도 클래스명.메소드이름() 로 사용 가능하다
    }
}
