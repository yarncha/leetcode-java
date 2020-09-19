public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        System.out.println(maxDepth(tree));
    }

    public static int maxDepth(TreeNode root) {
        int depth = 0;

        if (root != null) {
            depth = recuDepth(root, 0);
        }

        return depth;
    }

    public static int recuDepth(TreeNode tree, int depth) {
        int res = depth;
        res++;

        if (tree.left != null && tree.right != null) {
            int lDepth = recuDepth(tree.left, res);
            int rDepth = recuDepth(tree.right, res);
            res = Math.max(lDepth, rDepth);
        } else if (tree.left != null) {
            res = recuDepth(tree.left, res);
        } else if (tree.right != null) {
            res = recuDepth(tree.right, res);
        }

        return res;
    }
}