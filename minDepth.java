class Solution {
    public int minDepth(TreeNode root) {
        //111
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        int depth = 1;

        while (!qu.isEmpty()) {
            int size = qu.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = qu.poll();

                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    qu.offer(node.left);
                }
                if (node.right != null) {
                    qu.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}