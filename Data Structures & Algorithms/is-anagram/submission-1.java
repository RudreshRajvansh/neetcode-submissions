class Solution {
    public boolean isAnagram(String s, String t) {
        //so whats in my mind tbh its two hashmaps with each char. freq. matching
        //size will be same ryt so can we create a hashmap from one word then delete a char 
        //freq-- as each char is found in second word at last if the hashmap is empty then anagram else not 
        //but is there a fxn to check the occupancy of hashmap can anything tell if its complete empty
        if(s.length() != t.length()) return false;
        
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
            freq.put(t.charAt(i),freq.getOrDefault(t.charAt(i),0)-1);
        }
        //now i just need to check if hashap is complete empty
        return Collections.frequency(freq.values(), 0) == freq.size();
    }
}
