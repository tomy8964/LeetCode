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

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean answer = false;
        if (root.left != null) {
            answer = isBalanced(root.left);
            if (!answer) {
                return false;
            }
        }
        if (root.right != null) {
            answer = isBalanced(root.right);
            if (!answer) {
                return false;
            }
        }
        answer = Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;

        return answer;
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}