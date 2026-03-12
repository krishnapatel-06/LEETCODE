class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        //5

        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int length = 0;
        boolean odd = false;

        for (int c : count) {
            if (c % 2 == 0) {
                length += c;
            } else {
                length += c - 1;
                odd = true;
            }
        }
        if (odd) {
            length += 1;
        }
        return length;
    }
}