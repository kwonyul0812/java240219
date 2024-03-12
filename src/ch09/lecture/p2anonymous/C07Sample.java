package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성

        Game rpsGame = new Game() {
            @Override
            public void play() {
                String[] rsp = {"가위", "바위", "보"};
                Random random = new Random();
                int ans = random.nextInt(3);
                System.out.println(rsp[ans]);

            }
        };
        rpsGame.play();

        Game lottoGame = new Game() {
            @Override
            public void play() {
                Random random = new Random();
                int num[] = new int[6];
                int count = 0;

                Loop1:
                while (count < 6) {
                    int rn = random.nextInt(45) + 1;
                    for (int i = 0; i < count; i++) {
                        if (num[i] == rn)
                            continue Loop1;
                    }
                    num[count] = rn;
                    count++;
                }
                System.out.println(Arrays.toString(num));
            }
        };
        lottoGame.play();
    }
}

interface Game {
    void play();
}
