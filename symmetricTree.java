class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();

        qu.offer(root);
        qu.offer(root);

        while(!qu.isEmpty()){
            TreeNode t1 = qu.poll();
            TreeNode t2 = qu.poll();

            if(t1 == null && t2 ==null){
                continue;
            }
            if(t1 == null || t2 == null){
                return false;
            }
            if(t1.val != t2.val){
                return false;
            }

            qu.offer(t1.left);
            qu.offer(t2.right);
            qu.offer(t1.right);
            qu.offer(t2.left);
        }
        return true;
    } 
}