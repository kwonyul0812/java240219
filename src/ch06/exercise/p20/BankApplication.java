package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts = new Account[100];
//        for (int i = 0; i < accounts.length; i++)
//            accounts[i] = new Account();

        int count = 0;
        String searchName;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            String ans = scanner.nextLine();

            switch (ans) {
                case "1":
                    accounts[count] = new Account();
                    System.out.println("-------");
                    System.out.println("계좌생성");
                    System.out.println("-------");
                    System.out.print("계좌번호: ");
                    accounts[count].setAccount(scanner.nextLine());
                    System.out.print("계좌주: ");
                    accounts[count].setName(scanner.nextLine());
                    System.out.print("초기입금액: ");
                    accounts[count].setMoney(scanner.nextInt());

                    scanner.nextLine();
                    System.out.println("결과: 계좌가 생성되었습니다.");

                    count++;
                    continue;

                case "2":
                    System.out.println("-------");
                    System.out.println("계좌목록");
                    System.out.println("-------");

                    for (int i = 0; i < count; i++) {
                        System.out.println(STR."\{accounts[i].getAccount()}   \{accounts[i].getName()}   \{accounts[i].getMoney()}");
                    }
                    continue;

                case "3":
                    System.out.println("-------");
                    System.out.println("예금");
                    System.out.println("-------");

                    System.out.print("계좌번호: ");
                    searchName = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (searchName.equals(accounts[i].getAccount())) {
                            System.out.print("예금액: ");
                            accounts[i].setMoney(scanner.nextInt());
                            scanner.nextLine();
                        }
                    }
                    continue;

                case "4":
                    System.out.println("-------");
                    System.out.println("출금");
                    System.out.println("-------");

                    System.out.print("계좌번호: ");
                    searchName = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (searchName.equals(accounts[i].getAccount())) {
                            System.out.print("출금액: ");
                            accounts[i].withdrawMoney(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("결과: 출금이 성공되었습니다.");
                        }
                    }
                    continue;

                case "5":
                    System.out.println("프로그램 종료");
                    break;
            }
            break;
        }

        scanner.close();
    }
}
