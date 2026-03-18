/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()){
            int size = qu.size();

            for(int i =0;i<size;i++){
                TreeNode current = qu.poll();

                if(i == size -1){
                    result.add(current.val);
                }
                if(current.left !=null){
                    qu.add(current.left);
                }
                if(current.right != null){
                    qu.add(current.right);
                }
            }
        }
        return result;
    }
}