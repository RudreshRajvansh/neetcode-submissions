class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : strs) {
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(count[i]); 
            }
            String keyStr = key.toString();

            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(word);
        }

        return new ArrayList<>(map.values());
    }
}