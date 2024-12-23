// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0 ; i < sentences.length ; i++){
            String str = sentences[i];
            int a = 0;
            List<Integer> list = new ArrayList<>();
            for(int j =0 ; j< str.length() ;j++)
            if(str.charAt(j) == ' '){
                a++;
            }
            if (a>max){
                max = a;
            }
        }
        return max+1;
    }
}