class Solution {
    public boolean hasDuplicate(int[] nums) {
        //counting and bucket sorting fail due to value range 
        HashMap<Integer,Integer> chk = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int x = chk.get(nums[i])!=null?chk.get(nums[i]):0;
            chk.put(nums[i],x+1);
            if(chk.get(nums[i])>=2){
                return true;
            }
        }
        return false;
    }
}