// Last updated: 9/3/2025, 10:07:46 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       return numBottles+shop(numBottles,numExchange);
    }
    static int shop(int b,int req){
        if(b<req)return 0;
        return b/req+shop(b/req+b%req,req);
    }
}