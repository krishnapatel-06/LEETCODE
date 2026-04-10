class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //112
        
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        int remainingS = targetSum - root.val;

        return hasPathSum(root.left,remainingS) || hasPathSum(root.right,remainingS);
    }
}