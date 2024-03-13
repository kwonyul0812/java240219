package ch16.exercise.p7;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrmin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrmin((result, score) -> score > result ? score : result);
//        int max = maxOrmin((result, score) -> Math.max(result, max));
        System.out.println("최대값: " + max);

//        int min = maxOrmin((result, score) -> {
//            if (score < result)
//                return score;
//            return result;
//        });
//        int min = maxOrmin(Math::min);
//        int min = maxOrmin((result, score) -> score < result ? score : result);
        int min = maxOrmin((result, score) -> Math.min(result, score));
        System.out.println("최소값: " + min);
    }
}
