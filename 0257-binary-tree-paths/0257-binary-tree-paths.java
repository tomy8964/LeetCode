
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
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null)
            searchBT(root, "", answer);
        return answer;
    }

    public void searchBT(TreeNode root, String path, List<String> answer) {
        // leaf node
        if (root.left == null && root.right == null) {
            answer.add(path + root.val);
        }
        // has left child node
        if (root.left != null) {
            searchBT(root.left, path + root.val + "->", answer);
        }
        // has right child node
        if (root.right != null) {
            searchBT(root.right, path + root.val + "->", answer);
        }
    }

}
