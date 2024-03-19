import java.util.*;

public class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String cal = ineq + eq;

        int ans = switch (cal) {
            case ">=" -> n >= m ? 1 : 0;
            case "<=" -> n <= m ? 1 : 0;
            case ">!" -> n > m ? 1 : 0;
            default -> n < m ? 1 : 0;
        };
        return ans;
    }
}