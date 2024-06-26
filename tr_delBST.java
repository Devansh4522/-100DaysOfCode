public class tr_delBST {

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

    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null)
                return root;
            // first case
            if (root.val == key) {
                if (root.left == null && root.right == null) {
                    return null;
                } else if (root.left != null && root.right == null) {
                    return root.left;
                } else if (root.left == null && root.right != null) {
                    return root.right;
                } else if (root.left != null && root.right != null) {
                    root.val = findMin(root.right).val;
                    root.right = deleteNode(root.right, root.val);
                    return root;
                }

            } else if (root.val > key)
                root.left = deleteNode(root.left, key);
            else
                root.right = deleteNode(root.right, key);

            return root;
        }

        public TreeNode findMin(TreeNode root) {
            if (root == null || root.left == null) {
                return root;
            }
            return findMin(root.left);
        }
    }
}
