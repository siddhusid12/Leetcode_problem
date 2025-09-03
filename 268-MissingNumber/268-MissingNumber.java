// Last updated: 9/3/2025, 10:08:09 AM
class Solution {
  public int missingNumber(int[] nums) {
    int ans = nums.length;

    for (int i = 0; i < nums.length; ++i)
      ans ^= i ^ nums[i];

    return ans;
  }
}