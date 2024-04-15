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

class tr_insertBST {

    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                TreeNode newNode = new TreeNode(val);
                return newNode;
            }
            if (val > root.val) {
                root.right = insertIntoBST(root.right, val);
            }
            if (val < root.val) {
                root.left = insertIntoBST(root.left, val);
            }
            return root;
        }
    }
}