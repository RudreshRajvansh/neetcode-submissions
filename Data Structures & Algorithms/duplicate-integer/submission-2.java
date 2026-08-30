class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Hashmaps are heavy 
        HashSet<Integer> chk = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(chk.add(nums[i]) == false){
                return true;
            }
        }
        return false;
    }
}