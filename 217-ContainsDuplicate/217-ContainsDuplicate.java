// Last updated: 9/3/2025, 10:08:19 AM
class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();

    for (final int num : nums)
      if (!seen.add(num))
        return true;

    return false;
  }
}