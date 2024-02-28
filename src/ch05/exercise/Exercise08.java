package ch05.exercise;

public class Exercise08 {
    public static void main(String[] args) {

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count += array[i].length;
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
            }
        }
        double avg = (double) sum / count;
        System.out.println("전체 합 : " + sum);
        System.out.println("전체 평균 : " + avg);
    }
}
