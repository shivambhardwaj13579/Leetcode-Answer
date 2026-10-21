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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> al = new ArrayList<>();
        path(al, new StringBuilder(""), root);
        return al;
    }
    public void path(List<String> al, StringBuilder sb, TreeNode root) {
        if(root == null) {
            return;
        }
        int len = sb.length();
        if(len != 0) {
            sb.append("->");
        }
        sb.append(root.val);
        if(root.right == null && root.left == null) {
            al.add(sb.toString());
        }
        else {
            path(al, sb , root.left);
            path(al, sb , root.right);
        }
        sb.setLength(len);
    }
}