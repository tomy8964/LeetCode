/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
import java.util.*;
class Solution {
    public static int answer = Integer.MIN_VALUE;
    public static int maxDepth(Node root) {
        if (root == null) return 0;
        answer = Integer.MIN_VALUE;
        dfs(root, 1);
        return answer;
    }

    public static void dfs(Node root, int depth) {
        if (root.children.isEmpty()) {
            answer = Math.max(answer, depth);
            return;
        }
        for (Node child : root.children) {
            dfs(child, depth + 1);
        }
    }
}