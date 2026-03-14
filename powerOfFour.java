class Solution {
    public boolean isPowerOfFour(int n) {
        //342
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}