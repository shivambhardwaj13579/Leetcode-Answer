class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        for(int i = 0, j = 0 ; i < s.length() ; i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else{
                while(hs.contains(s.charAt(i))){
                    hs.remove(s.charAt(j));
                    j++;
                }
                hs.add(s.charAt(i));
            }
            max = Math.max(max,hs.size());
        }
        return max; 
    }
}