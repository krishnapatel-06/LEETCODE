import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //3
        
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);

            // If character already exists, move left pointer
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);  // store latest index
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}