class Solution {
    public int minChanges(String s) {
        int len = s.length();
        int ans = 0;
        for(int i = 0 ; i < len ; i = i + 2) {
            if(s.charAt(i) != s.charAt(i+1)) ans++; 
        }
        return ans;
    }
}