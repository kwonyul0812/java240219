package ch05.lecture.p1array;

public class C18NestedArray {
    public static void main(String[] args) {

        int[] arr3 = new int[]{0, 1, 2};
        int[] arr4 = {1, 2, 3, 4};

        int[][] arr5 = new int[][]{
                {9, 1, 4, 5},
                {11, 15, 13, 10},
                {-1, -7, 77, 10, -12}
        };
        int[][] arr6 = {
                {9, 1, 4, 5},
                {11, 15, 13, 10},
                {-1, -7, 77, 10, -12}
        };

        int[][] arr7 = new int[3][];
        arr7[0] = new int[]{5, 4, 1};
        arr7[1] = new int[]{8, 0, 3};
        arr7[2] = new int[]{99, 98};
    }
}
