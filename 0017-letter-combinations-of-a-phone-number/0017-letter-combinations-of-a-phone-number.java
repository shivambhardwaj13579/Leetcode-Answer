class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<String>();
        printComb(digits, 0, "" , l);
        return l;
    }
    public static String[] keypad = {"" , "" , "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public void printComb(String digits, int idx , String str , List<String> l){
        if(idx == digits.length()) {
            l.add(str);
            return;
        }
        char currChar = digits.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++) {
            printComb(digits, idx+1, str+mapping.charAt(i) , l);
        }
    }
}