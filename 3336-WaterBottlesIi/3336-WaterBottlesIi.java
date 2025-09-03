// Last updated: 9/3/2025, 10:07:40 AM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        return shop(numBottles,numExchange);
                                                                                            
    }
    static int shop(int b,int exc){
        int i=0;
        int a=b;
        while(b>=exc){
            b-=exc;
            exc++;
            i++;
            a++;
            if(b<exc){
                b+=i;
                i=0;
            }
        }
       

    return a;
    }
}