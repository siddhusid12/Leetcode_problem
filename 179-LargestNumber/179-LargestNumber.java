// Last updated: 9/3/2025, 10:08:29 AM
class Solution {
  public String largestNumber(int[] nums) {
    final String s = Arrays.stream(nums)
                         .mapToObj(String::valueOf)
                         .sorted((a, b) -> (b + a).compareTo(a + b))
                         .collect(Collectors.joining(""));
    return s.startsWith("00") ? "0" : s;
  }
}
