package c02.lecture.p02type;

import java.util.Scanner;

public class C16Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        System.out.println("line = " + line);

        scanner.close();
    }
}
