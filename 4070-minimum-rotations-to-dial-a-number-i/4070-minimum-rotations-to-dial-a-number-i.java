class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int curr = 0;
        for(char c : s.toCharArray()) {
            int now = Math.abs(curr - (c-'0'));
            ans += Math.min(now , 10 - now);
            curr = c-'0';
        }
        return ans;
    }
}