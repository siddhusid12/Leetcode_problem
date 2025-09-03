// Last updated: 9/3/2025, 10:09:14 AM
class Solution {
   public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;

            result.append(sum % 2);

            carry = sum / 2;

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}