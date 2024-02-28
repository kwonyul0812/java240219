package ch05.lecture.p1array;

public class C14Copy {
    public static void main(String[] args) {
        int[] arr1 = {30, 40, 2, 1, 5};
        int[] arr2 = new int[5];

        // System.arraycopy(원본, 원본의 시작위치, 타겟, 타겟의 시작위치, 복사항목 수)
        System.arraycopy(arr1, 0, arr2, 0, 5);

        System.out.println();
    }
}
