class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //102
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0;i<size;i++){
                TreeNode cu = qu.poll();
                level.add(cu.val);

                if(cu.left != null){
                    qu.offer(cu.left);
                }
                if(cu.right != null){
                    qu.offer(cu.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}