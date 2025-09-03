// Last updated: 9/3/2025, 10:07:59 AM
class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int b=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                continue;
            }
        }
        for(int i=0;i<n;i++){
        b+=nums[i]-min;
        }
    
    return b;
    }
}