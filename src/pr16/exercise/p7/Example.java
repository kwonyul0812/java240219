package pr16.exercise.p7;

public class Example {
    private static int[] scores = {10, 50, 33, 44};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(Math::max);
        int min = maxOrMin(Math::min);
        System.out.println(max);
        System.out.println(min);
    }
}
