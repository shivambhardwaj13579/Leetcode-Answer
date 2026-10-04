class Solution {
    public int lengthOfLastWord(String s) {
        String tri = s.trim();
        int i = tri.lastIndexOf(" ");
        String str = tri.substring(i+1);
        return str.length();
    }
}