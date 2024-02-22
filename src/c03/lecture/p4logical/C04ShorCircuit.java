package c03.lecture.p4logical;

public class C04ShorCircuit {
    public static void main(String[] args) {
        // 단락 (short-circuit-evaluation)
        // && 연산중 앞에서 false가 나온다면 뒤의 연산은 진행하지 않고 false를 반환한다.
        // 반대로 앞이 true 가 나온다면 뒤의 연산까지 진행하여 결과를 확인한다.

        int i = 10;
        boolean b2 = (i++) == 10 && (i++) == 20;
        System.out.println("b2 = " + b2);
        System.out.println("i = " + i);


        i = 10;
        boolean b3 = (i++) == 20 && (i++) == 30;
        System.out.println("b3 = " + b3);
        System.out.println("i = " + i);
    }
}
