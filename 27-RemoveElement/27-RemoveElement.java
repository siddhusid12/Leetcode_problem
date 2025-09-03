// Last updated: 9/3/2025, 10:09:30 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=0;
        for(int x: nums){
            if(x!=val){
                nums[k++]=x;
            }
        }
        
        return k;
    }
}