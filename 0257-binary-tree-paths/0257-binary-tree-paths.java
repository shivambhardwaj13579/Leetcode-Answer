class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> al = new ArrayList<>();
        path(al, new StringBuilder(""), root);
        return al;
    }

    public void path(List<String> al, StringBuilder sb, TreeNode root) {
        if (root == null) {
            return;
        }

        int len = sb.length();

        if (len > 0) {
            sb.append("->");
        }
        sb.append(root.val);

        if (root.left == null && root.right == null) {
            al.add(sb.toString());
            sb.setLength(len);
            return;
        }

        path(al, sb, root.right);
        path(al, sb, root.left);

        sb.setLength(len);
    }
}