class Solution {
    public int climbStairs(int n) {
        // 70 
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 2;
        }
        int F = 1;
        int S = 2;
        int T = 0;

        for (int i = 3; i <= n; i++) {
            T = F + S;
            F = S;
            S = T;
        }
        return S;
    }
}