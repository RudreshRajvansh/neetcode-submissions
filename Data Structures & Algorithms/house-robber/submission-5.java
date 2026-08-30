class Solution {
    public int rob(int[] nums) {
        int prev1 = 0,prev2 = 0;
        prev1 = nums[0];
        if(nums.length==1){
            return nums[0];
        }else{
             prev2 = Math.max(prev1,nums[1]);
        }
        for(int i = 2;i<nums.length;i++){
         int current_max = Math.max(prev1+nums[i],prev2);
         prev1=prev2;
         prev2 = current_max;
        }
        return prev2;
    }
}
