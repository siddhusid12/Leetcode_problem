// Last updated: 9/3/2025, 10:09:27 AM
class Solution {
    public static void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public static void reverse(int[] nums, int k){
        int n = nums.length;
        int l = k;
        int r = n-1;
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }
}