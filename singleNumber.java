class Solution {
    public int singleNumber(int[] nums) {
        //136
        
        int result = 0;

        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}