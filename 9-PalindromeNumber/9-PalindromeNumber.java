// Last updated: 9/3/2025, 10:09:55 AM
class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0)
      return false;

    long reversed = 0;
    int y = x;

    while (y > 0) {
      reversed = reversed * 10 + y % 10;
      y /= 10;
    }

    return reversed == x;
    }
}