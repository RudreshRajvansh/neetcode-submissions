class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Hashmaps are heavy 
        HashSet<Integer> chk = new HashSet<>(2*nums.length);
        for(int x : nums){
            if(chk.add(x) == false){
                return true;
            }
        }
        return false;
    }
}