// https://leetcode.com/problems/find-words-containing-character/

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       ArrayList<Integer> ans=new ArrayList<Integer>();
       for (int i =0 ; i<words.length; i++){
        if (words[i].indexOf(x) != -1){
            ans.add(i);
        }
       }
       return ans;
    }
}