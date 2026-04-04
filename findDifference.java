class Solution {
    public char findTheDifference(String s, String t) {
        //389
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }        
        return result;
    }
}