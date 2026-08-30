class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev1,prev2;
        prev1 = cost[0];
        if(cost.length==1){
            return cost[0];
        }else{
            prev2 = cost[1];
        }
        for(int i = 2;i<cost.length;i++){
            int min = Math.min(prev1 + cost[i], prev2+cost[i]);
            prev1 = prev2;
            prev2 = min;
        }
        return prev2>prev1?prev1:prev2;
    }
}