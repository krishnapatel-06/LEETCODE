class Solution {
    public int maxSubArray(int[] nums) {

        // leetcode 53
        int currentS = nums[0];
        int maxS = nums[0];

        for(int i = 1; i < nums.length;i++){
            currentS = Math.max(nums[i], currentS + nums[i]);
            maxS = Math.max(maxS,currentS);
        }
        return maxS;
    }
}