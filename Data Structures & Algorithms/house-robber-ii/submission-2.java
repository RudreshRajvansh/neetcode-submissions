class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int prev1,prev2,prev3,prev4;
        prev1 = nums[0];
        if (nums.length == 1) {
            return prev1;
        }else {
            prev2 = Math.max(nums[0], nums[1]);
        }
        for (int i = 2; i < nums.length-1; i++) {
           int max  = Math.max(prev1 + nums[i], prev2);
           prev1 = prev2;
           prev2 = max;
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }else {
            prev3 = nums[1];
            prev4 = Math.max(nums[2], nums[1]);
        }
        for (int i = 3; i < nums.length; i++) {
           int max  = Math.max(prev3 + nums[i], prev4);
           prev3 = prev4;
           prev4 = max;
        }
        int max = prev4>prev2?prev4:prev2;
        return max;
    }
}