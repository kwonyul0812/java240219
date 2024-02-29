package ch05.exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Exercise09 {
    public static void main(String[] args) {

        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            int ans = scanner.nextInt(); //5 enter

            if (ans == 1) {
                System.out.print("학생수> ");
                int count = parseInt(scanner.next());
                scores = new int[count];
                continue;
            } else if (ans == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print(STR."scores[\{i}]> ");
                    scores[i] = scanner.nextInt();
                }
                continue;
            } else if (ans == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println(STR."scores[\{i}]: " + scores[i]);
                }
                continue;
            } else if (ans == 4) {
                int max = scores[0];
                int sum = 0;
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                    if (scores[i] > max)
                        max = scores[i];
                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + ((double) sum / scores.length));
                continue;
            } else if (ans == 5) {
                System.out.println("프로그램 종료");
                break;
            }
            break;
        }
        scanner.close();
    }
}
