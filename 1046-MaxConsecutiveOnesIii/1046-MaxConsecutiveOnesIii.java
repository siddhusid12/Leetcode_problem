// Last updated: 9/3/2025, 10:07:49 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j++]==0){
            k--;
        }
        if(k<0){
        if(nums[i++]==0){
            k++;

        }
        }
        }
        return j-i;



    }
}