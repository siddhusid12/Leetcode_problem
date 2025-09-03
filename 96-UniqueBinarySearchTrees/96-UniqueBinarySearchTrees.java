// Last updated: 9/3/2025, 10:08:58 AM
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        int rightSideNodes;
        for(int i = 2; i <= n; i++) {
            rightSideNodes = 0;
            for(int j = i - 1; j >= 0; j--) {
                dp[i] += dp[j] * dp[rightSideNodes++];
            }
        }
        return dp[n];
    }
}