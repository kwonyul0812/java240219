package c02.lecture.p02type;

public class C11Boolean {
    public static void main(String[] args) {
        // boolean (논리형)
        // 값 : true, false
        // 크기 : 1byte

        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("안녕하세요");
        }
        if (b) { // b = false 이기때문에 출력 안함
            System.out.println("반갑습니다");
        }
    }
}
