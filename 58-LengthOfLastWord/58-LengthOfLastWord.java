// Last updated: 9/3/2025, 10:09:18 AM
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }

        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        int count = 0;
        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }

        return count;
    }
}