// Last updated: 9/3/2025, 10:09:50 AM
class Solution {
    public int romanToInt(String s) {
        int tot=0;
        int pre=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=values(s.charAt(i));

            if(cur<pre){
                tot-=cur;

            }
            else{
                tot+=cur;
            }
            pre=cur;
        }   
        return tot;
    }
    static int  values(char ch ){
        switch(ch){
            case 'I' :return 1;
            case 'V' :return 5;
            case 'X' :return 10;
            case 'L' :return 50;
            case 'C' :return 100;
            case 'D' :return 500;
            case 'M' :return 1000;
            default: return 0;  
        }
    }
        
        
    }
