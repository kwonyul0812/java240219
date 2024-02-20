package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char (character)
        // 2byte == 16bits
        // 0 ~ 65535
        // unicode

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = 65536; // x
//        char e = -1; // x
        char f = 4314;
        char g = 8258;
        char h = 0x2042;
        char i = 'c'; // 99
        char j = '⁂'; // 8258
        char k = 0xac00; // '가'


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        int o = 0x1f607;

        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println(emojis);

        // 1f3a4 : 마이크 모양 이모지 출력

        int p = 0x1f3a4;

        char[] emoji2 = Character.toChars(p);
        String emojis2 = new String(emoji2);
        System.out.println(emojis2);
    }
}