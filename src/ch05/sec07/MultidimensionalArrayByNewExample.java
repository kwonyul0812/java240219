package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }
        System.out.println();
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        int totalStudent = 0;
        int englishSum = 0;

        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                englishSum += englishScores[i][k];
            }
        }
        double engAvg = (double) englishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + engAvg);

    }
}
