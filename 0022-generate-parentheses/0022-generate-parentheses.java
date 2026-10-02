class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        genPer(n, ans, sb, 0, 0);
        return ans;
    }

    public void genPer(int n, List<String> ans, StringBuilder sb, int open, int close) {
        if (n * 2 == sb.length()) {
            ans.add(sb.toString());
            return;
        }
        if (close < n) {
            sb.append("(");
            genPer(n, ans, sb, open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (open < close) {
            sb.append(")");
            genPer(n, ans, sb, open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}