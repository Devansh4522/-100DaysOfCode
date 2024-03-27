
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class tr_flatten {

    TreeNode head = null;

    public void flatten(TreeNode root) {
        if (root != null)
            revPreOrder(root);
    }

    private void revPreOrder(TreeNode node) {
        if (node.right != null)
            revPreOrder(node.right);
        if (node.left != null)
            revPreOrder(node.left);
        node.left = null;
        node.right = head;
        head = node;
    }

    // Morris Traversal Method

    /*
     * public void flatten(TreeNode root) {
     * TreeNode curr = root;
     * while (curr != null) {
     * if (curr.left != null) {
     * TreeNode runner = curr.left;
     * while (runner.right != null) runner = runner.right;
     * runner.right = curr.right;
     * curr.right = curr.left;
     * curr.left = null;
     * }
     * curr = curr.right;
     * }
     * }
     */
}
