import java.util.List;
import java.util.ArrayList;

public class tr_KthLargest {

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
        public List<Integer> inorder(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorderTraversal(root, result);
            return result;
        }

        private void inorderTraversal(TreeNode root, List<Integer> result) {
            if (root == null)
                return;
            inorderTraversal(root.left, result);
            result.add(root.val);
            inorderTraversal(root.right, result);
        }

        public int kthSmallest(TreeNode root, int k) {
            List<Integer> result = inorder(root);
            if (k > 0 && k <= result.size()) {
                return result.get(k - 1);
            }
            return -1;
        }
    }
}
