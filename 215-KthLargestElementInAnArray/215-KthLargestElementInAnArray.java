// Last updated: 9/3/2025, 10:08:20 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return (nums[nums.length-k]);
    }
}