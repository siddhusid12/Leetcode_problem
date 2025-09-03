// Last updated: 9/3/2025, 10:08:13 AM
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    int[] count = new int[26];

    for (final char c : s.toCharArray())
      ++count[c - 'a'];

    for (final char c : t.toCharArray()) {
      if (count[c - 'a'] == 0)
        return false;
      --count[c - 'a'];
    }

    return true;
  }
}