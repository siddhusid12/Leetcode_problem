// Last updated: 9/3/2025, 10:09:51 AM
class Solution {
    public String intToRoman(int num) {
        String [] thous={"","M","MM","MMM","MMMM"};
        String [] hunder={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] ten={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] one={"","I","II","III","IV","V","VI","VII","VIII","IX"};
         
         return thous[num/1000]+hunder[(num%1000)/100]+ten[(num%100)/10]+one[(num%10)/1];

    }

}