class Solution {
    public int lengthOfLastWord(String s) {
        //58
        s = s.trim();
        int last = s.lastIndexOf(' ');
        return s.length() - last - 1;
    }
}