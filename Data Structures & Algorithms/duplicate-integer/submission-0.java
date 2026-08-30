class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int chk = nums[i];
            for(int j = i+1;j<n;j++){
                if(nums[j] == chk){
                    return true;
                }
            }
        }
        return false;
    }
}