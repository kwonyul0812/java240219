package ch05.lecture.p1array;

public class C01ReferenceType {
    public static void main(String[] args) {
        // 기본타입(primitive type) 8개 외는 모두 참조타입

        // 배열 : 여러 값을 갖는 타입
        int[] arr;
        arr = new int[]{3, 4, 5};

        //arr가 가진 실제 값을 알고 싶을때
        // System.identityHashcode(arr);
        System.out.println(System.identityHashCode(arr));


    }
}
