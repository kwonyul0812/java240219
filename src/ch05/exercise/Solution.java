package ch05.exercise;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int result[];
        result = new int[]{1, 2, 1};

        int ans[];
        ans = new int[result.length * 2];

        for (int i = 0; i < ans.length; i++) {
            if (i < result.length)
                ans[i] = result[i];
            else
                ans[i] = result[i - result.length];
        }
        return ans;
    }
}