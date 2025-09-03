// Last updated: 9/3/2025, 10:09:28 AM
class Solution {
    public int divide(int dividend, int divisor) {
        int ans = dividend / divisor;

        if(dividend == Integer.MAX_VALUE && divisor == 1){
            ans = Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            ans = Integer.MAX_VALUE;
        }
        return ans;
    }
}