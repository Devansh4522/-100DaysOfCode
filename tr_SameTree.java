
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

public class tr_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (q == null || p == null)
            return false;

        if (p.val != q.val)
            return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
